package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GridTest {

	int width = 10;
	int height = 10;
	
	@Test
	void getGridTest() {
		Grid grid = new Grid(width, height);
		assertEquals(10, grid.getWidth());
		assertEquals(10, grid.getHeight());
	}

}
