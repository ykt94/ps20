package com.baken.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.baken.actors.EarthGroup;
import com.baken.actors.Mars;
import com.baken.load.AssetLoader;

public class Gui extends Stage {
	public enum toggle {play,pause};
	public toggle status = toggle.play;
	public Button playButton;
	public EarthGroup earthGroup;
	public Mars mars;
	public Image sun;
	
	public Gui() {
		super(new ScreenViewport());
		
		playButton = new Button(AssetLoader.btn_style.up);
		playButton.setBounds(2, 2, 100, 100);
		playButton.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				if(status == toggle.pause) {
					status = toggle.play;
				} else {
					status = toggle.pause;
				}
				AssetLoader.change(status.ordinal());
				playButton.setStyle(AssetLoader.btn_style);
			}
		});
		addActor(playButton);
		
		earthGroup = new EarthGroup();
		addActor(earthGroup);
		
		mars = new Mars();
		addActor(mars);
		
		sun = new Image(new Texture(Gdx.files.internal("sun.png")));
		sun.setBounds(375, 275, 50, 50);		
		addActor(sun);
		
	}
}
