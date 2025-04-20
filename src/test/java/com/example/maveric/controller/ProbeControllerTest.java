package com.example.maveric.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.example.maveric.model.Position;
import com.example.maveric.service.ProbeService;

class ProbeControllerTest {	
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}, direction={2}, command={3}")
	@CsvSource(value = {"1, 2, 'EAST', 'FORWARD'"}, ignoreLeadingAndTrailingWhitespace = true)
	void moveProbe(int x, int y, String direction, String command) 
	{
		Position start = new Position(x, y, direction);
		
		ProbeService ps = new ProbeService();
		Position end = ps.executeCommands(start, command);
		
		assertEquals(end.getX(), 2);
		assertEquals(end.getY(), 2);
		assertEquals(end.getDirection(), "EAST");
	}	 
}
