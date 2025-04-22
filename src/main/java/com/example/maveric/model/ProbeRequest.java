package com.example.maveric.model;

import java.util.List;

public class ProbeRequest {
	
	private Position start;
    private Command command;
    private int gridWidth = 10;
    private int gridHeight = 10;
    private List<Position> obstacles;
    
    public ProbeRequest(Position start, Command command) {
		// TODO Auto-generated constructor stub
		this.start = start;
	    this.command = command;
	}
    
	public Position getStart() {
		return start;
	}
	public void setStart(Position start) {
		this.start = start;
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
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
