package com.example.maveric.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.example.maveric.model.Position;

class ProbeControllerTest {
	
	
	
	@ParameterizedTest
	@CsvSource(value = {"1, 2, EAST, FORWARD"}, ignoreLeadingAndTrailingWhitespace = true)
	
	void moveProbe(int x, int y, String direction, String command) {
		
		ProbeController pc = new ProbeController();
		Position start = new Position(x, y, direction);
		
		Position end = pc.moveProbe(start, command);
		assertEquals(end.getX(), 2);
		assertEquals(end.getY(), 2);
		assertEquals(end.getDirection(), "EAST");
	}
}
