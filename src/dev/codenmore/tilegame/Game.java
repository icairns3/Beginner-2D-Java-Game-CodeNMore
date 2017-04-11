package dev.codenmore.tilegame;

import dev.codenmore.tilegame.display.Display;

public class Game implements Runnable {
	private Display display;
	private Thread thread;
	private boolean running = false;
	
	// not sure why public
	public int width,height;
	public String title;
	
	public Game(String title, int width,int height){
		this.width=width;
		this.title= title;
		this.height=height;
		
		
	}

	@Override
	public void run() {
		init();
		
		while(running){
			tick();
			render();
		}
		
	}
	
	private void render() {
		
		
	}

	private void tick() {
		
		
	}

	private void init(){
		display = new Display(title,width,height);
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
