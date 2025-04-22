package com.example.maveric.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.example.maveric.model.Command;
import com.example.maveric.model.Position;
import com.example.maveric.service.ProbeService;

class ProbeControllerTest {	
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}, direction={2}, command={3}")
	@CsvSource(value = {"1, 2, 'EAST', 'MOVE_FORWARD'"}, ignoreLeadingAndTrailingWhitespace = true)
	void moveProbePostiveScenario(int x, int y, String direction, String command) 
	{
		Position start = new Position(x, y, direction);
		
		ProbeService ps = new ProbeService();
		
		List<Command> commands = new ArrayList<>();
		switch (command) {
        	case "MOVE_FORWARD" -> {
				commands.add(Command.MOVE_FORWARD);
        	}
        	case "MOVE_BACKWARD" -> {
        		commands.add(Command.MOVE_BACKWARD);
        	}
        	case "TURN_LEFT" -> {
        		commands.add(Command.TURN_LEFT);
        	}
        	case "TURN_RIGHT" -> {
        		commands.add(Command.TURN_RIGHT);
        	}
        }
		Position end = ps.executeCommands(start, commands);
		
		assertEquals(end.getX(), 2);
		assertEquals(end.getY(), 2);
		assertEquals(end.getDirection(), "EAST");
	}
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}, direction={2}, command={3}")
	@CsvSource(value = {"1, 2, 'EAST', 'MOVE_FORWARD'", "1, 2, 'WEST', 'MOVE_FORWARD'", "1, 2, 'SOUTH', 'MOVE_FORWARD'", "1, 2, 'NORTH', 'MOVE_FORWARD'"}, ignoreLeadingAndTrailingWhitespace = true)
	void moveProbeNegativeScenario(int x, int y, String direction, String command) 
	{
		Position start = new Position(x, y, direction);
		
		ProbeService ps = new ProbeService();
		List<Command> commands = new ArrayList<>();
		switch (command) {
        	case "MOVE_FORWARD" -> {
				commands.add(Command.MOVE_FORWARD);
        	}
        	case "MOVE_BACKWARD" -> {
        		commands.add(Command.MOVE_BACKWARD);
        	}
        	case "TURN_LEFT" -> {
        		commands.add(Command.TURN_LEFT);
        	}
        	case "TURN_RIGHT" -> {
        		commands.add(Command.TURN_RIGHT);
        	}
        }       	
		
		Position end = ps.executeCommands(start, commands);
		
		assertNotEquals(end.getX(), 3);
		assertNotEquals(end.getY(), 4);
		assertNotEquals(end.getDirection(), "WESTTTT");
	}
}
