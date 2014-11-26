package com.shimori.asteroids.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.shimori.asteroids.managers.GameInputProcessor;
import com.shimori.asteroids.managers.GameKeys;


public class Game implements ApplicationListener{
	
	public static int WIDTH;
	public static int HEIGHT;
	
	public static OrthographicCamera camera;
	
	public void create(){
		
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(WIDTH, HEIGHT);
		camera.translate(WIDTH / 2, HEIGHT / 2);
		camera.update();
		
		Gdx.input.setInputProcessor(new GameInputProcessor());
	}
	
	public void render(){
		
		// clear screen black
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		if (GameKeys.isPressed(GameKeys.SPACE)) {
			System.out.println("SPACE");
		}
		
		if (GameKeys.isPressed(GameKeys.ESCAPE)) {
			System.out.println("ESCAPE");
		}
		
		GameKeys.update();
		
	}
	
	public void resize(int width, int height){}
	public void pause(){}
	public void resume(){}
	public void dispose(){}

}
