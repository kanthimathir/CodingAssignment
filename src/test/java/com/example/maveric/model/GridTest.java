package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GridTest {

	int width = 10;
	int height = 10;
	Grid grid = new Grid(width, height);
	
	@Test
	void getGridTest() {		
		assertEquals(10, grid.getWidth());
		assertEquals(10, grid.getHeight());
	}
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}")
	@CsvSource(value = {"1, 2", "10, 10", "0, 0"}, ignoreLeadingAndTrailingWhitespace = true)
	void checkBoundsPositiveScenario(int x, int y) {
		boolean withinBounds = grid.isWithinBounds(x, y);
		assertTrue(withinBounds);
	}
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}")
	@CsvSource(value = {"11, 2", "11, 12", "1, 12"}, ignoreLeadingAndTrailingWhitespace = true)
	void checkBoundsNegativeScenario(int x, int y) {
		boolean withinBounds = grid.isWithinBounds(x, y);
		assertFalse(withinBounds);
	}
}
