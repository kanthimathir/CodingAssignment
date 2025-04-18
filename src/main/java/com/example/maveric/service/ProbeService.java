package com.example.maveric.service;

import com.example.maveric.model.Position;

public class ProbeService {

	public Position executeCommands(Position start, String command) {
		// TODO Auto-generated method stub
		int x = start.getX();
        int y = start.getY();
        
        switch (command) {
	        case "FORWARD" -> {
	            x++;
	        }
	        case "BACKWARD" -> {
	            x--;
	        }
        }
        
		return new Position(x, y);
	}

}
