package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {

	@Test
	void getcoordinates() {
		int i = 1;
		int j = 2;
		Position p1 = new Position(1,2);
		assertEquals(i, p1.getX());
		assertEquals(j, p1.getY());
	}
}
