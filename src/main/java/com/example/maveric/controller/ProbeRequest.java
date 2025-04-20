package com.example.maveric.controller;

import com.example.maveric.model.Command;
import com.example.maveric.model.Position;

public class ProbeRequest {
	
	private Position start;
    private Command command;
    
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


}
