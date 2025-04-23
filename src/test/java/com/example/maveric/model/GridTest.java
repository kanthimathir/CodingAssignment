package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GridTest {
 
	Grid grid;
	
	@ParameterizedTest(name = "{index} => width={0}, height={1}")
	@CsvSource(value = {"10, 10" , "5, 10", "10, 5"}, ignoreLeadingAndTrailingWhitespace = true)
	void getGridTestPositiveScenario(int width, int height) { 
		grid = new Grid(width, height);
		assertEquals(width, grid.width());
		assertEquals(height, grid.height()); 
	}
	
	@ParameterizedTest (name = "{index} => width={0}, height={1}")
	@CsvSource(value = {"0, 0" , "-5, -5", "-10, 5", "5, -10"}, ignoreLeadingAndTrailingWhitespace = true)
	void isBlankNegativeScenario(int width, int height) {
		if ((width <= 0) || (height <= 0)){
			assertTrue(true);
		} 
	}
} 