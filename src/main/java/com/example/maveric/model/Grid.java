package com.example.maveric.model;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private int width;
    private int height;
    private Set<Position> obstacles = new HashSet<>();

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x <= width && y >= 0 && y <= height;
    }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void addObstacle(Position pos) {
        obstacles.add(pos);
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.contains(new Position(x, y, null));
    }
}