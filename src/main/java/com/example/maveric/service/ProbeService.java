package com.example.maveric.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.maveric.model.Command;
import com.example.maveric.model.Coordinate;
import com.example.maveric.model.ProbeRequest;
import com.example.maveric.model.ProbeResult;

@Service

public class ProbeService {
	public ProbeResult executeCommands(ProbeRequest request) {
		// TODO Auto-generated method stub
		Set<Coordinate> visited = new LinkedHashSet<>();
        Coordinate current = request.start();
        String direction = request.direction();

        visited.add(current);

        for (Command command : request.commands()) {
	        switch (command) {
		        case MOVE_BACKWARD -> {
	                Coordinate next = move(current, direction, -1);
	                if (isValidMove(next, request)) {
	                    current = next;
	                    visited.add(current);
	                }
		        } 
		        case MOVE_FORWARD -> {
                    Coordinate next = move(current, direction, 1);
                    if (isValidMove(next, request)) {
                        current = next;
                        visited.add(current);
                    }
                }     	                   
	            case TURN_LEFT -> direction = turnLeft(direction);
                case TURN_RIGHT -> direction = turnRight(direction);
	        }
        }
        return new ProbeResult(current, direction, new ArrayList<>(visited));
	}
	
	private Coordinate move(Coordinate coord, String dir, int delta) {
        return switch (dir) {
            case "NORTH" -> new Coordinate(coord.x(), coord.y() + delta);
            case "SOUTH" -> new Coordinate(coord.x(), coord.y() - delta);
            case "EAST"  -> new Coordinate(coord.x() + delta, coord.y());
            case "WEST"  -> new Coordinate(coord.x() - delta, coord.y());
		default -> throw new IllegalArgumentException("Unexpected value: " + dir);
        };
    }
	
	private boolean isValidMove(Coordinate coord, ProbeRequest request) {
        boolean onGrid = coord.x() >= 0 && coord.y() >= 0 &&
                         coord.x() < request.grid().width() &&
                         coord.y() < request.grid().height();
        boolean isObstacle = request.obstacles().contains(coord);
        return onGrid && !isObstacle;
    }

    private String turnLeft(String dir) {
        return switch (dir) {
            case "NORTH" -> "WEST";
            case "WEST" -> "SOUTH";
            case "SOUTH" -> "EAST";
            case "EAST" -> "NORTH";
		default -> throw new IllegalArgumentException("Unexpected value: " + dir);
        };
    }
    
    private String turnRight(String dir) {
        return switch (dir) {
            case "NORTH" -> "EAST";
            case "EAST" -> "SOUTH";
            case "SOUTH" -> "WEST";
            case "WEST" -> "NORTH";
		default -> throw new IllegalArgumentException("Unexpected value: " + dir);
        };
    }
}
