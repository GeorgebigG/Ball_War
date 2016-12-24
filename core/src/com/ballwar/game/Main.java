package com.ballwar.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ballwar.game.Screens.MenuScreen;

public class Main extends Game {
	SpriteBatch batch;

	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 480;

	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MenuScreen(this, batch));
	}
}
