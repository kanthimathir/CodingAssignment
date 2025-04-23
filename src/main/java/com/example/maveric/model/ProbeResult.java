package com.example.maveric.model;

import java.util.List;

public class ProbeResult {
    private Coordinate  finalPosition;
    private String finalDirection;
    private List<Coordinate> visitedCoordinates;

    public ProbeResult(Coordinate finalPosition, String finalDirection, List<Coordinate> visitedCoordinates) {
        this.finalPosition = finalPosition;
        this.finalDirection = finalDirection;
        this.visitedCoordinates = visitedCoordinates;
    }

	public String getFinalDirection() {
		return finalDirection;
	}

	public Coordinate getFinalPosition() {
		return finalPosition;
	}

	public List<Coordinate> getVisitedCoordinates() {
		return visitedCoordinates;
	}     
}