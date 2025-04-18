package com.example.maveric.model;

public class Position {

	private int x;
    private int y;
    
	public Position(int i, int j) {
		// TODO Auto-generated constructor stub
		this.x = i;
	    this.y = j;
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
}
