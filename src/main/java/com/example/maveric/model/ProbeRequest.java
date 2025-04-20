package com.example.maveric.model;

public class ProbeRequest {
	
	private Position start;
    private Command command;
    
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
}
