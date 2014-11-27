package com.shimori.asteroids.gamestates;

import com.shimori.asteroids.managers.GameStateManager;

public abstract class GameState {
	
	protected GameStateManager gsm;
	
	protected GameState(GameStateManager gsm){
		this.gsm = gsm;
	}
	
	public abstract void init();
	public abstract void update(float ft);
	public abstract void draw();
	public abstract void handleInput();
	public abstract void dispose();

}
