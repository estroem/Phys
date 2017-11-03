package com.eirikstrom.phys;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.eirikstrom.phys.game.Game;
import com.eirikstrom.phys.gui.GUI;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Game game;
	GUI gui;

	@Override
	public void create () {
		batch = new SpriteBatch();
		game = new Game();
		gui = new GUI(batch, game);
	}

	@Override
	public void render () {
		game.update();
		gui.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
