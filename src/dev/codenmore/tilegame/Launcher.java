package dev.codenmore.tilegame;

import dev.codenmore.tilegame.display.Display;

public class Launcher {
	public static void main(String[] args){
		Game myGame=new Game("Title!",300,300);
		myGame.start();
	}
}
