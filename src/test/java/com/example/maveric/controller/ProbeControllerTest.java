package com.example.maveric.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest; 
import org.junit.jupiter.params.provider.CsvSource; 

import com.example.maveric.model.Command;
import com.example.maveric.model.Coordinate;
import com.example.maveric.model.Grid;
import com.example.maveric.model.ProbeRequest;
import com.example.maveric.model.ProbeResult; 
import com.example.maveric.service.ProbeService;

class ProbeControllerTest {
	
	ProbeService ps;
	ProbeRequest request;

	@ParameterizedTest(name = "{index} => x={0}, y={1}, direction={2}, command={3}")
	@CsvSource(value = {"1, 2, 'EAST', 'MOVE_FORWARD'"}, ignoreLeadingAndTrailingWhitespace = true) 
	void moveProbePostiveScenario(int x, int y, String direction, String command) { 
		Grid grid = new Grid(10, 10);
		ps = new ProbeService();
		Coordinate start = new Coordinate(x, y);
		
		List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		
		List<Command> commands = new ArrayList<>(); 
		
		switch (command) { 
			case "MOVE_FORWARD" -> { commands.add(Command.MOVE_FORWARD); } 
			case "MOVE_BACKWARD" -> { commands.add(Command.MOVE_BACKWARD); } 
			case "TURN_LEFT" -> { commands.add(Command.TURN_LEFT); } 
			case "TURN_RIGHT" -> { commands.add(Command.TURN_RIGHT); } 
		} 
		
		request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		ProbeResult response = ps.executeCommands(request);
		
		assertEquals(new Coordinate(2, 2), response.getFinalPosition());
		assertEquals("EAST", response.getFinalDirection());
	}
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}, direction={2}, command={3}")
	@CsvSource(value = {"1, 2, 'EAST', 'MOVE_FORWARD'", "1, 2, 'WEST', 'MOVE_FORWARD'", "1, 2, 'SOUTH', 'MOVE_FORWARD'", "1, 2, 'NORTH', 'MOVE_FORWARD'"}, ignoreLeadingAndTrailingWhitespace = true)
	void moveProbeNegativeScenario(int x, int y, String direction, String command) { 
		Grid grid = new Grid(10, 10); 
		ps = new ProbeService();
		Coordinate start = new Coordinate(x, y);
		
		List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		
		List<Command> commands = new ArrayList<>(); 
		
		switch (command) { 
			case "MOVE_FORWARD" -> { commands.add(Command.MOVE_FORWARD); } 
			case "MOVE_BACKWARD" -> { commands.add(Command.MOVE_BACKWARD); } 
			case "TURN_LEFT" -> { commands.add(Command.TURN_LEFT); } 
			case "TURN_RIGHT" -> { commands.add(Command.TURN_RIGHT); }		
		}
		request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		ProbeResult response = ps.executeCommands(request);
		
		assertNotEquals(new Coordinate(3, 4), response.getFinalPosition());
		assertNotEquals("WESTTTTT", response.getFinalDirection());
	} 
}