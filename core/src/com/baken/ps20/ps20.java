package com.baken.ps20;

import com.badlogic.gdx.Game;
import com.baken.load.AssetLoader;
import com.baken.screens.MainScreen;

public class ps20 extends Game {
	
	@Override
	public void create () {
		AssetLoader.load();
		setScreen(new MainScreen());
	}

}
