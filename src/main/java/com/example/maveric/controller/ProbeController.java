package com.example.maveric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.maveric.model.Grid;
import com.example.maveric.model.Position;
import com.example.maveric.model.ProbeRequest;
import com.example.maveric.service.ProbeService;

@RestController
@RequestMapping("/api/probe")

public class ProbeController {
	@Autowired
	private ProbeService ps; 
    
	@PostMapping("/move")
	public Position moveProbe(@RequestBody ProbeRequest request) {
		// TODO Auto-generated method stub
		Grid grid = new Grid(request.getGridWidth(), request.getGridHeight());
	    if (request.getObstacles() != null) {
	        for (Position obstacle : request.getObstacles()) {
	            grid.addObstacle(obstacle);
	        }
	    }

	    ps.setGrid(grid);
		return ps.executeCommands(request.getStart(), request.getCommand());
	}

}
