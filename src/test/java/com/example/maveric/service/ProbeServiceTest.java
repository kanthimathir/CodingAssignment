package com.example.maveric.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.maveric.model.Command;
import com.example.maveric.model.Position;

class ProbeServiceTest {

	private ProbeService probeService = new ProbeService();
	
	@Test
    void shouldMoveForward() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(3, end.getX());
        assertEquals(2, end.getY());
        assertEquals("EAST", end.getDirection());
    }
	
	@Test
    void shouldMoveBackward() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(1, end.getX());
        assertEquals(2, end.getY());
        assertEquals("EAST", end.getDirection());
    }
	
	@Test
	void shouldTurnRight() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("SOUTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeft() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("NORTH", end.getDirection());
	}
}
