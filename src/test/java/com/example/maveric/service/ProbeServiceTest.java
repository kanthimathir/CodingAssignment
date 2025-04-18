package com.example.maveric.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.maveric.model.Position;

class ProbeServiceTest {

	private ProbeService probeService = new ProbeService();
	
	@Test
    void shouldMoveForward() {
        Position start = new Position(2, 2);
        String command = "FORWARD";
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(3, end.getX());
        assertEquals(2, end.getY());
    }
	
	@Test
    void shouldMoveBackward() {
        Position start = new Position(2, 2);
        String command = "BACKWARD";
        
        Position end = probeService.executeCommands(start, command);

        assertEquals(1, end.getX());
        assertEquals(2, end.getY());
    }
}
