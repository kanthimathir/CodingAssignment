package com.example.maveric.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
}
