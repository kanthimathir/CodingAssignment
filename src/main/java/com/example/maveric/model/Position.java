package com.example.maveric.model;

public class Position {

	private int x;
    private int y;
    private Coordinate coordinate;
    private String direction;
    
    public Position(Coordinate coordinate, String strDirection) {
		// TODO Auto-generated constructor stub
		this.coordinate = coordinate;
	    this.direction = strDirection;
	}
    
	public Position(int x, int y, String strDirection) {
		// TODO Auto-generated constructor stub
		this.x = x;
	    this.y = y;
	    this.coordinate = new Coordinate(x, y);
	    direction = strDirection;
	}
	
	public Coordinate getCoordinate() {
		// TODO Auto-generated method stub
		return coordinate; 
	}
	
	public void setCoordinate(Coordinate coordinate) {
		// TODO Auto-generated method stub
		this.coordinate = coordinate; 
	}	

	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
