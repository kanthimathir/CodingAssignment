package com.example.maveric.model;

import java.util.List;

public class ProbeRequest {
	
	private Position start;
    private List<Command> commands;
    private int gridWidth = 10;
    private int gridHeight = 10;
    private List<Position> obstacles;
    
    public ProbeRequest(Position start, List<Command> commands) {
		// TODO Auto-generated constructor stub
		this.start = start;
	    this.commands = commands;
	}
    
	public Position getStart() {
		return start;
	}
	public void setStart(Position start) {
		this.start = start;
	}
	public List<Command> getCommands() {
		return commands;
	}
	public void setCommand(List<Command> commands) {
		this.commands = commands;
	}

	public int getGridWidth() {
		return gridWidth;
	}

	public void setGridWidth(int gridWidth) {
		this.gridWidth = gridWidth;
	}

	public int getGridHeight() {
		return gridHeight;
	}

	public void setGridHeight(int gridHeight) {
		this.gridHeight = gridHeight;
	}

	public List<Position> getObstacles() {
		return obstacles;
	}

	public void setObstacles(List<Position> obstacles) {
		this.obstacles = obstacles;
	}
	
}
