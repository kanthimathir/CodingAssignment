package com.example.maveric.service;
  
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.maveric.model.Command;
import com.example.maveric.model.Coordinate;
import com.example.maveric.model.Grid;
import com.example.maveric.model.ProbeRequest;
import com.example.maveric.model.ProbeResult;
  
class ProbeServiceTest {
  
	 private ProbeService probeService;
	 private ProbeRequest request;
	 
	 @BeforeEach
	 public void setup() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(2, 2)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
	 }

	 @Test
	 void shouldMoveForwardFromEastPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(3, 2), response.getFinalPosition());
	     assertEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromEastPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromEastPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromEastPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("NORTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveForwardFromEastNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertNotEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromEastNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertNotEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromEastNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("NORTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromEastNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "EAST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("SOUTH", response.getFinalDirection());
		 
	 }

	 @Test
	 void shouldMoveForwardFromWestPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromWestPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(3, 2), response.getFinalPosition());
	     assertEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromWestPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("NORTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromWestPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveForwardFromWestNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(2, 1), response.getFinalPosition());
	     assertNotEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromWestNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(2, 3), response.getFinalPosition());
	     assertNotEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromWestNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromWestNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "WEST";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("NORTH", response.getFinalDirection());
		 
	 }
	 

	 @Test
	 void shouldMoveForwardFromSounthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 1), response.getFinalPosition());
	     assertEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromSounthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 3), response.getFinalPosition());
	     assertEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromSounthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromSounthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveForwardFromSounthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(3, 2), response.getFinalPosition());
	     assertNotEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromSounthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(2, 1), response.getFinalPosition());
	     assertNotEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromSounthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromSounthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "SOUTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("WEST", response.getFinalDirection());
		 
	 }

	 @Test
	 void shouldMoveForwardFromNorthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 3), response.getFinalPosition());
	     assertEquals("NORTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromNorthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 1), response.getFinalPosition());
	     assertEquals("NORTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromNorthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromNorthPositiveScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertEquals(new Coordinate(2, 2), response.getFinalPosition());
	     assertEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveForwardFromNorthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_FORWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(3, 2), response.getFinalPosition());
	     assertNotEquals("EAST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldMoveBackwardFromNorthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.MOVE_BACKWARD   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(2, 3), response.getFinalPosition());
	     assertNotEquals("SOUTH", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnRightFromNorthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_RIGHT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("WEST", response.getFinalDirection());
		 
	 }
	 
	 @Test
	 void shouldTurnLeftFromNorthNegativeScenario() {
		 probeService = new ProbeService();
		 
		 Coordinate start = new Coordinate(2, 2);
		 String direction = "NORTH";
		 List<Command> commands = Arrays.asList(
	            Command.TURN_LEFT   // (0, 1)	            
	     );
		 Grid grid = new Grid(5, 5);
		 List<Coordinate> obstacles = List.of(new Coordinate(3, 3)); // irrelevant for this test
		 request = new ProbeRequest(start, direction, commands, grid, obstacles);
		 
		 ProbeResult response = probeService.executeCommands(request);

		 assertNotEquals(new Coordinate(1, 2), response.getFinalPosition());
	     assertNotEquals("EAST", response.getFinalDirection());
		 
	 }

}
 