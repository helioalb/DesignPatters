package me.helioalbano.designpatterns.behavioral.command.app;

import me.helioalbano.designpatterns.behavioral.command.Command;

public class Button {
	private String label;
	private Command command;

	public Button(String label, Command command) {
		this.label = label;
		this.command = command;
	}
	
	public String click() {
		String clickResult = command.execute();
		return String.join(" ", "Button", label, "was clicked.", clickResult);
	}
}
