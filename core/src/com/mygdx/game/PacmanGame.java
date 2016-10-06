package com.mygdx.game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.Game;

public class PacmanGame extends Game {
    public static SpriteBatch batch;
 
    public void create () {
        batch = new SpriteBatch();
        setScreen(new GameScreen(this));
    }
    
   
 
    @Override
    public void dispose () {
        batch.dispose();
    }
}
