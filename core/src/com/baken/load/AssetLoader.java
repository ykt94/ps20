package com.baken.load;

import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class AssetLoader {
	
	public static Texture planets;
	public static ButtonStyle btn_style;
	
	static Skin skin;
	
	public static void load() {
		
		planets = new Texture(Gdx.files.internal("planets.png"));
		
		skin = new Skin();
		skin.addRegions(new TextureAtlas(Gdx.files.internal("buttoms.atlas")));
		btn_style = new ButtonStyle();
		btn_style.up = skin.getDrawable("pause");
		
	}
	
	public static void change(int status) {
		if(status == 0) {
			btn_style.up = skin.getDrawable("pause");
		} else {
			btn_style.up = skin.getDrawable("play");
		}
	}

}
