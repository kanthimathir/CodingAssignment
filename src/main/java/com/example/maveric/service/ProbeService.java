package com.example.maveric.service;

import org.springframework.stereotype.Service;

import com.example.maveric.model.Position;

@Service

public class ProbeService {

	public Position executeCommands(Position start, String command) {
		// TODO Auto-generated method stub
		int x = start.getX();
        int y = start.getY();
        String direction = start.getDirection();
        
        switch (command) {
	        case "FORWARD" -> {
	        	switch (direction) {
                case "NORTH" -> y++;
                case "SOUTH" -> y--;
                case "EAST" -> x++;
                case "WEST" -> x--;
	        	}
	        }
	        case "BACKWARD" -> {
	        	switch (direction) {
                case "NORTH" -> y--;
                case "SOUTH" -> y++;
                case "EAST" -> x--;
                case "WEST" -> x++;
            }
	        }
        }
        
		return new Position(x, y, direction);
	}

}
