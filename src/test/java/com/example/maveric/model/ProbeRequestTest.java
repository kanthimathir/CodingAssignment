package com.example.maveric.model;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.maveric.service.ProbeService;

class ProbeRequestTest{
	
	 private ProbeService probeService;
	 private ProbeRequest request;
	 
	 @BeforeEach
	 public void setup() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(0, 0);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD,   // (0, 1)
	            Command.TURN_RIGHT,     // facing EAST
	            Command.MOVE_FORWARD,   // (1, 1)
	            Command.TURN_LEFT,      // facing NORTH
	            Command.MOVE_BACKWARD   // (1, 0) -> assume no obstacle
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(2, 2)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
	 }
	 	 
	 @Test
	 void givenRequestObj_ResponseReceived_Positive_Test() {  
	     ProbeResult response = probeService.executeCommands(request);
	     // Assertions
	     assertEquals(new Coordinate(1, 0), response.getFinalPosition());
	     assertEquals("NORTH", response.getFinalDirection());
	     assertTrue(response.getVisitedCoordinates().contains(new Coordinate(0, 0)));
	     assertTrue(response.getVisitedCoordinates().contains(new Coordinate(0, 1)));
	     assertTrue(response.getVisitedCoordinates().contains(new Coordinate(1, 1)));
	     assertTrue(response.getVisitedCoordinates().contains(new Coordinate(1, 0)));
	 }
	 
	 @Test
	 void givenRequestObj_ResponseReceived_Negative_Test() {  
	     ProbeResult response = probeService.executeCommands(request);
	     // Assertions
	     assertNotEquals(new Coordinate(11, 10), response.getFinalPosition());
	     assertNotEquals("SOUTH", response.getFinalDirection());
	     assertFalse(response.getVisitedCoordinates().contains(new Coordinate(10, 10)));
	     assertFalse(response.getVisitedCoordinates().contains(new Coordinate(10, 11)));
	     assertFalse(response.getVisitedCoordinates().contains(new Coordinate(11, 11)));
	     assertFalse(response.getVisitedCoordinates().contains(new Coordinate(11, 10)));
	 }
}