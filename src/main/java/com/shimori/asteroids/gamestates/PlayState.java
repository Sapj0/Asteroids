package com.shimori.asteroids.gamestates;

import com.shimori.asteroids.managers.GameStateManager;

public class PlayState extends GameState{

	public PlayState(GameStateManager gsm) {
		super(gsm);
		init();
	}
	
	public void init(){}
	
	public void update(float ft){
		System.out.println("PLAY STATE UPDTATING");
	}
	
	public void draw(){
		System.out.println("PLAY STATE DRAWING");
	}
	
	public void handleInput(){}
	
	public void dispose(){}
	

}
