package com.example.maveric.model;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class CommandTest {

	@ParameterizedTest
	@ValueSource(strings = {"MOVE_FORWARD", "MOVE_BACKWARD", "TURN_LEFT", "TURN_RIGHT"})
	void isBlankPositiveScenario(String command) {
	    assertTrue(Strings.isNotBlank(command));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"  ", "\t", "\n"})
	void isBlankNegativeScenario(String command) {
	    assertTrue(Strings.isBlank(command));
	}

}
