package com.shimori.asteroids.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.shimori.asteroids.managers.GameInputProcessor;
import com.shimori.asteroids.managers.GameKeys;
import com.shimori.asteroids.managers.GameStateManager;


public class Game implements ApplicationListener{
	
	public static int WIDTH;
	public static int HEIGHT;
	
	public static OrthographicCamera camera;
	
	private GameStateManager gsm;
	
	public void create(){
		
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(WIDTH, HEIGHT);
		camera.translate(WIDTH / 2, HEIGHT / 2);
		camera.update();
		
		Gdx.input.setInputProcessor(new GameInputProcessor());
		
		gsm = new GameStateManager();
	}
	
	public void render(){
		
		// clear screen black
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.draw();
		
		GameKeys.update();
		
	}
	
	public void resize(int width, int height){}
	public void pause(){}
	public void resume(){}
	public void dispose(){}

}
