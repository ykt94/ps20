package com.baken.actors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.baken.load.AssetLoader;


public class Mars extends Actor {
	TextureRegion region;
	private final int ROTATION_SPEED = -40;

	public Mars() {
		region = new TextureRegion(AssetLoader.planets,0,0,50,50);
        setBounds(100,300,50,50);
 	}

	@Override
	public void draw (Batch batch, float parentAlpha) {
		batch.draw(region, getX(), getY(), 300, 0,
				getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		rotateBy(delta*ROTATION_SPEED);
	}
	
}

