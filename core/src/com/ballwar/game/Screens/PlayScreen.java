package com.ballwar.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.ballwar.game.Main;

/**
 * Created by gio on 12/24/16.
 */
public class PlayScreen implements Screen {

    Main main;
    SpriteBatch batch;

    public PlayScreen(Main main, SpriteBatch batch) {
        this.main = main;
        this.batch = batch;
        Gdx.gl.glClearColor(1, 1, 1, 1);
    }

    public void update(float dt) {

    }

    public void render(float delta) {
        update(delta);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.end();
    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
