package com.example.maveric.controller;

import com.example.maveric.model.Position;

public class ProbeRequest {
	
	private Position start;
    private String command;
    
	public Position getStart() {
		return start;
	}
	public void setStart(Position start) {
		this.start = start;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}


}
