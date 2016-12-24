package com.ballwar.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.ballwar.game.Main;

public class MenuScreen implements Screen {

    SpriteBatch batch;
    Image playbtn;
    Texture playbtnTexture;

    boolean playbtnClicked;
    Main main;

    public MenuScreen(Main main, SpriteBatch batch) {
        this.main = main;
        this.batch = batch;
        Gdx.gl.glClearColor(1, 1, 1, 1);

        playbtnTexture = new Texture("playbtn.png");
        playbtn = new Image(playbtnTexture);

        float scale = Gdx.graphics.getHeight() / 4;
        float x = Gdx.graphics.getWidth() / 2 - scale / 2;
        float y = Gdx.graphics.getHeight() / 2 - scale / 2;

        Stage stage = new Stage();

        playbtn.setBounds(x, y, scale, scale);

        playbtn.addListener(new InputListener() {
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                setPlaybtnClicked(true);
            }
        });

    }

    public void update(float dt) {
        if (isPlaybtnClicked())
            main.setScreen(new PlayScreen(main, batch));

    }

    @Override
    public void render(float delta) {
        update(delta);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        playbtn.draw(batch, 1);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {

    }

    public boolean isPlaybtnClicked() {
        return playbtnClicked;
    }

    public void setPlaybtnClicked(boolean playbtnClicked) {
        this.playbtnClicked = playbtnClicked;
    }
}
