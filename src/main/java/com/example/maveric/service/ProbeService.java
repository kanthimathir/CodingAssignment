package com.example.maveric.service;

import org.springframework.stereotype.Service;

import com.example.maveric.model.Command;
import com.example.maveric.model.Position;

@Service

public class ProbeService {

	public Position executeCommands(Position start, Command command) {
		// TODO Auto-generated method stub
		int x = start.getX();
        int y = start.getY();
        String direction = start.getDirection();
        
        switch (command) {
	        case MOVE_FORWARD -> {
	        	switch (direction) {
                case "NORTH" -> y++;
                case "SOUTH" -> y--;
                case "EAST" -> x++;
                case "WEST" -> x--;
	        	};
	        }
	        case MOVE_BACKWARD -> {
	        	switch (direction) {
                case "NORTH" -> y--;
                case "SOUTH" -> y++;
                case "EAST" -> x--;
                case "WEST" -> x++;
	        	};
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
