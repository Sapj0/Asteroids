package com.shimori.asteroids.gamestates;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.shimori.asteroids.entities.Player;
import com.shimori.asteroids.managers.GameKeys;
import com.shimori.asteroids.managers.GameStateManager;

public class PlayState extends GameState{

	private ShapeRenderer sr;
	
	private Player player;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		
	}
	
	public void init(){
		sr = new ShapeRenderer();
		player = new Player();
	}
	
	public void update(float dt){
		
		handleInput();
		player.update(dt);
	}
	
	public void draw(){
		player.draw(sr);
	}
	
	public void handleInput(){
		player.setLeft(GameKeys.isDown(GameKeys.LEFT));
		player.setRight(GameKeys.isDown(GameKeys.RIGHT));
		player.setUp(GameKeys.isDown(GameKeys.UP));
	}
	
	public void dispose(){}
	

}
