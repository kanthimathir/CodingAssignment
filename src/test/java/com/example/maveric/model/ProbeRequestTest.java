package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ProbeRequestTest {

	@Test
	void getProbeRequestTestPositiveScenario() {
		int i = 1;
		int j = 2;
		String direction = "EAST";
		List<Command> commands = List.of(Command.MOVE_FORWARD);		
		Position start = new Position (1, 2, direction);
		
		ProbeRequest p1 = new ProbeRequest(start, commands);
		assertEquals(i, p1.getStart().getX());
		assertEquals(j, p1.getStart().getY());
		assertEquals("EAST", p1.getStart().getDirection());
		assertEquals(commands, p1.getCommands());
	}
	
	@Test
	void getProbeRequestTestNegativeScenario() {
		int i = 3;
		int j = 3;
		String direction = "EAST";
		List<Command> commands = List.of(Command.MOVE_FORWARD);		
		Position start = new Position (1, 2, direction);
		
		ProbeRequest p1 = new ProbeRequest(start, commands);
		assertNotEquals(i, p1.getStart().getX());
		assertNotEquals(j, p1.getStart().getY());
		assertNotEquals("WEST", p1.getStart().getDirection());
		assertNotEquals("MOVE_BACKWARD", p1.getCommands());
	}

}
