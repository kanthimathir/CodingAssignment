package com.example.maveric.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.maveric.model.Command;
import com.example.maveric.model.Position;

class ProbeServiceTest {

	private ProbeService probeService = new ProbeService();
	
	@Test
    void shouldMoveForwardFromEast() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(3, end.getX());
        assertEquals(2, end.getY());
        assertEquals("EAST", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromEast() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(1, end.getX());
        assertEquals(2, end.getY());
        assertEquals("EAST", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromEast() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("SOUTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromEast() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("NORTH", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromWest() {
        Position start = new Position(2, 2, "WEST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(1, end.getX());
        assertEquals(2, end.getY());
        assertEquals("WEST", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromWest() {
        Position start = new Position(2, 2, "WEST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(3, end.getX());
        assertEquals(2, end.getY());
        assertEquals("WEST", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromWest() {
	    Position start = new Position(0, 0, "WEST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("NORTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromWest() {
	    Position start = new Position(0, 0, "WEST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("SOUTH", end.getDirection());
	}	
	
	@Test
    void shouldMoveForwardFromSounth() {
        Position start = new Position(2, 2, "SOUTH");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(1, end.getY());
        assertEquals("SOUTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromSounth() {
        Position start = new Position(2, 2, "SOUTH");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(3, end.getY());
        assertEquals("SOUTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromSounth() {
	    Position start = new Position(0, 0, "SOUTH");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("WEST", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromSounth() {
	    Position start = new Position(0, 0, "SOUTH");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("EAST", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromNorth() {
        Position start = new Position(2, 2, "NORTH");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(3, end.getY());
        assertEquals("NORTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromNorth() {
        Position start = new Position(2, 2, "NORTH");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(1, end.getY());
        assertEquals("NORTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromNorth() {
	    Position start = new Position(0, 0, "NORTH");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("EAST", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromNorth() {
	    Position start = new Position(0, 0, "NORTH");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("WEST", end.getDirection());
	}
}
