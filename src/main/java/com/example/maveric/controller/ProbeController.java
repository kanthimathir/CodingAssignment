package com.example.maveric.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.maveric.model.Position;
import com.example.maveric.service.ProbeService;

public class ProbeController {
	@Autowired
	ProbeService ps = new ProbeService();

	public Position moveProbe(Position start, String command) {
		// TODO Auto-generated method stub
		//Position start = new Position(1, 2, "EAST");
		//String command = "FORWARD";
		
		Position end = ps.executeCommands(start, command);
		int x = end.getX();
		int y = end.getY();
		String direction = end.getDirection();
		Position p1 = new Position(x,y,direction);
		return p1;
	}

}
