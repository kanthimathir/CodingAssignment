package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

	@Test
	void getCoordinatesPositiveScenario() {
		int i = 1;
		int j = 2;
		Position p1 = new Position(1,2, "EAST");
		assertEquals(i, p1.getX());
		assertEquals(j, p1.getY());
		assertEquals("EAST", p1.getDirection());
	}
	
	@Test
	void getCoordinatesNegativeScenario() {
		int i = 3;
		int j = 3;
		Position p1 = new Position(1,2, "EAST");
		assertNotEquals(i, p1.getX());
		assertNotEquals(j, p1.getY());
		assertNotEquals("WEST", p1.getDirection());
	}
}
