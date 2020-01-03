package com.baken.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainScreen implements Screen{
	SpriteBatch batch;
	Texture img;
	private Gui gui;
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		img = new Texture("buttoms.png");	
		gui = new Gui();
		Gdx.input.setInputProcessor(gui);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if(gui.status.ordinal() == 0) {
			gui.act(delta);
		}
			gui.draw();
	}

	@Override
	public void resize(int width, int height) {
		gui.getViewport().update(width, height, true);
	}


	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		batch.dispose();
		img.dispose();
		gui.dispose();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

}
