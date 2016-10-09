package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends ScreenAdapter {
    private World world;
    private PacmanGame pacmanGame;
    
    public GameScreen(PacmanGame pacmanGame) {
    	this.pacmanGame = pacmanGame;
        world = new World(pacmanGame);
    }
    public void render(float delta) {
        update(delta);
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        WorldRenderer worldRenderer = new WorldRenderer(pacmanGame,world);
        worldRenderer.render(delta);
        
    }
    private void update(float delta) {
    	Pacman pacman = world.getPacman();
   
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	pacman.setNextDirection(Pacman.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	pacman.setNextDirection(Pacman.DIRECTION_RIGHT);
        }
        
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	pacman.setNextDirection(Pacman.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
        	pacman.setNextDirection(Pacman.DIRECTION_UP);
        }
        world.update(delta);
        
    }	
    
}