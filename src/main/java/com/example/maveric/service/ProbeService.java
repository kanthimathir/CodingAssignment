package com.example.maveric.service;

import org.springframework.stereotype.Service;

import com.example.maveric.model.Command;
import com.example.maveric.model.Grid;
import com.example.maveric.model.Position;

@Service

public class ProbeService {
	int xaxis = 10;
	int yaxis = 10;
	private Grid grid;

    public ProbeService() {
        this.grid = new Grid(xaxis, yaxis); // Default 10x10 grid
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

	public Position executeCommands(Position start, Command command) {
		// TODO Auto-generated method stub
		int x = start.getX();
        int y = start.getY();
        String direction = start.getDirection();
        int dx = 0, dy = 0, newX = 0, newY = 0;
        
        switch (command) {
	        case MOVE_FORWARD -> {
	        	switch (direction) {
                case "NORTH" -> dy = 1;
                case "SOUTH" -> dy = -1;
                case "EAST" -> dx = 1;
                case "WEST" -> dx = -1;
	        	};
	        	
	        	newX = x + dx;
                newY = y + dy;
                
	        	if (grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY)) {
                    x = newX;
                    y = newY;
                }
	        }
	        case MOVE_BACKWARD -> {
	        	switch (direction) {
                case "NORTH" -> dy = -1;
                case "SOUTH" -> dy = 1;
                case "EAST" -> dx = -1;
                case "WEST" -> dx = 1;
	        	};
	        	newX = x + dx;
                newY = y + dy;
                
	        	if (grid.isWithinBounds(newX, newY) && !grid.isObstacle(newX, newY)) {
                    x = newX;
                    y = newY;
                }
            }
	        case TURN_LEFT -> {
	        	direction = switch (direction) {
                    case "NORTH" -> "WEST";
                    case "WEST" -> "SOUTH";
                    case "SOUTH" -> "EAST";
                    case "EAST" -> "NORTH";
                    default -> throw new IllegalArgumentException("Unexpected value: " + direction);
                };
            }
            case TURN_RIGHT -> {
                direction = switch (direction) {
                    case "NORTH" -> "EAST";
                    case "EAST" -> "SOUTH";
                    case "SOUTH" -> "WEST";
                    case "WEST" -> "NORTH";
                    default -> throw new IllegalArgumentException("Unexpected value: " + direction);
                };
	        }
        }
		return new Position(x, y, direction);
	}
}
