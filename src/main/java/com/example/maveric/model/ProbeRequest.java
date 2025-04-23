package com.example.maveric.model;

import java.util.List;

public record ProbeRequest(
	    Coordinate start,
	    String direction,
	    List<Command> commands,
	    Grid grid,
	    List<Coordinate> obstacles
	) {}
