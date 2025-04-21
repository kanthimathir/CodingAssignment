package com.example.maveric.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.maveric.model.Command;
import com.example.maveric.model.Position;

class ProbeServiceTest {

	private ProbeService probeService = new ProbeService();

	@Test
    void shouldMoveForwardFromEastPositiveScenario() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(3, end.getX());
        assertEquals(2, end.getY());
        assertEquals("EAST", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromEastPositiveScenario() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(1, end.getX());
        assertEquals(2, end.getY());
        assertEquals("EAST", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromEastPositiveScenario() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("SOUTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromEastPositiveScenario() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("NORTH", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromEastNegativeScenario() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(2, end.getX());
        assertNotEquals(3, end.getY());
        assertNotEquals("NORTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromEastNegativeScenario() {
        Position start = new Position(2, 2, "EAST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(2, end.getX());
        assertNotEquals(3, end.getY());
        assertNotEquals("NORTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromEastNegativeScenario() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("NORTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromEastNegativeScenario() {
	    Position start = new Position(0, 0, "EAST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("SOUTH", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromWestPositiveScenario() {
        Position start = new Position(2, 2, "WEST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(1, end.getX());
        assertEquals(2, end.getY());
        assertEquals("WEST", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromWestPositiveScenario() {
        Position start = new Position(2, 2, "WEST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(3, end.getX());
        assertEquals(2, end.getY());
        assertEquals("WEST", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromWestPositiveScenario() {
	    Position start = new Position(0, 0, "WEST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("NORTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromWestPositiveScenario() {
	    Position start = new Position(0, 0, "WEST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("SOUTH", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromWestNegativeScenario() {
        Position start = new Position(2, 2, "WEST");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(2, end.getX());
        assertNotEquals(1, end.getY());
        assertNotEquals("SOUTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromWestNegativeScenario() {
        Position start = new Position(2, 2, "WEST");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(2, end.getX());
        assertNotEquals(3, end.getY());
        assertNotEquals("SOUTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromWestNegativeScenario() {
	    Position start = new Position(0, 0, "WEST");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("SOUTH", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromWestNegativeScenario() {
	    Position start = new Position(0, 0, "WEST");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("NORTH", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromSounthPositiveScenario() {
        Position start = new Position(2, 2, "SOUTH");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(1, end.getY());
        assertEquals("SOUTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromSounthPositiveScenario() {
        Position start = new Position(2, 2, "SOUTH");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(3, end.getY());
        assertEquals("SOUTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromSounthPositiveScenario() {
	    Position start = new Position(0, 0, "SOUTH");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("WEST", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromSounthPositiveScenario() {
	    Position start = new Position(0, 0, "SOUTH");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("EAST", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromSounthNegativeScenario() {
        Position start = new Position(2, 2, "SOUTH");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(3, end.getX());
        assertNotEquals(2, end.getY());
        assertNotEquals("EAST", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromSounthNegativeScenario() {
        Position start = new Position(2, 2, "SOUTH");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(3, end.getX());
        assertNotEquals(2, end.getY());
        assertNotEquals("EAST", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromSounthNegativeScenario() {
	    Position start = new Position(0, 0, "SOUTH");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("EAST", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromSounthNegativeScenario() {
	    Position start = new Position(0, 0, "SOUTH");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("WEST", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromNorthPositiveScenario() {
        Position start = new Position(2, 2, "NORTH");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(3, end.getY());
        assertEquals("NORTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromNorthPositiveScenario() {
        Position start = new Position(2, 2, "NORTH");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(2, end.getX());
        assertEquals(1, end.getY());
        assertEquals("NORTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromNorthPositiveScenario() {
	    Position start = new Position(0, 0, "NORTH");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("EAST", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromNorthPositiveScenario() {
	    Position start = new Position(0, 0, "NORTH");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertEquals("WEST", end.getDirection());
	}
	
	@Test
    void shouldMoveForwardFromNorthNegativeScenario() {
        Position start = new Position(2, 2, "NORTH");
        Command command = Command.MOVE_FORWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(3, end.getX());
        assertNotEquals(2, end.getY());
        assertNotEquals("SOUTH", end.getDirection());
    }
	
	@Test
    void shouldMoveBackwardFromNorthNegativeScenario() {
        Position start = new Position(2, 2, "NORTH");
        Command command = Command.MOVE_BACKWARD;
        
        Position end = probeService.executeCommands(start, command);

        assertNotEquals(3, end.getX());
        assertNotEquals(2, end.getY());
        assertNotEquals("SOUTH", end.getDirection());
    }
	
	@Test
	void shouldTurnRightFromNorthNegativeScenario() {
	    Position start = new Position(0, 0, "NORTH");
	    Command command = Command.TURN_RIGHT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("WEST", end.getDirection());
	}
	
	@Test
	void shouldTurnLeftFromNorthNegativeScenario() {
	    Position start = new Position(0, 0, "NORTH");
	    Command command = Command.TURN_LEFT;

	    Position end = probeService.executeCommands(start, command);

	    assertNotEquals("EAST", end.getDirection());
	}
}
