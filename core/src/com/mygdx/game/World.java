package com.mygdx.game;

public class World {
	private Pacman pacman;
    private PacmanGame pacmanGame;
    private Maze maze;
    private int score;
    
    World(PacmanGame pacmanGame) {

        this.pacmanGame = pacmanGame;
        maze = new Maze();
        pacman = new Pacman(60,60,this);
    	registerDotEattenListener();
        score = 0;
    }
    
    Pacman getPacman() {
        return pacman;
    }
    
    Maze getMaze() {
    	return maze;
    }
    
    public void update(float delta) {
        pacman.update();
    }	
    
    public int getScore(){
    	return score;
    }
    
    public void increaseScore(){
    	score += 1;
    }
    private void registerDotEattenListener() {
        pacman.registerDotEattenListener(new Pacman.DotEattenListener() {
			public void notifyDotEattener() {
				score += 1;
			}
        });
    }
}
