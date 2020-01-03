package com.baken.actors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.baken.load.AssetLoader;

public class Earth extends Actor {

	TextureRegion region;

	public Earth() {
		region = new TextureRegion(AssetLoader.planets,51,0,50,50);
        setBounds(75,75,50,50);
 	}

	@Override
	public void draw (Batch batch, float parentAlpha) {
		batch.draw(region, getX(), getY(), getOriginX(), getOriginY(),
				getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
	}

}
