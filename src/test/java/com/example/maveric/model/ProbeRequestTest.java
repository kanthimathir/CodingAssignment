package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProbeRequestTest {

	@Test
	void test() {
		int i = 1;
		int j = 2;
		String direction = "EAST";
		Command command = Command.MOVE_FORWARD;		
		Position start = new Position (1, 2, direction);
		
		ProbeRequest p1 = new ProbeRequest(start, command);
		assertEquals(i, p1.getStart().getX());
		assertEquals(j, p1.getStart().getY());
		assertEquals("EAST", p1.getStart().getDirection());
		assertEquals("MOVE_FORWARD", p1.getCommand());
	}

}
