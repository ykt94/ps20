package com.baken.actors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.baken.load.AssetLoader;

public class Luna extends Actor {

	TextureRegion region;
	private final int ROTATION_SPEED = 30;

	public Luna() {
		region = new TextureRegion(AssetLoader.planets,101,0,50,50);
        setBounds(-10,90,20,20);
	}

	@Override
	public void draw (Batch batch, float parentAlpha) {
		batch.draw(region, getX(), getY(), 100, 0,
				getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		rotateBy(delta*ROTATION_SPEED);
	}
}
