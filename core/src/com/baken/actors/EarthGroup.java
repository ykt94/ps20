package com.baken.actors;

import com.badlogic.gdx.scenes.scene2d.Group;

public class EarthGroup extends Group {
	Earth earth;
	Luna luna;
	private final int ROTATION_SPEED = 30;

	public EarthGroup() {
		super();
		setBounds(100,200,200,200);
		setOrigin(300,100);
		earth = new Earth();
		addActor(earth);
		
		luna = new Luna();
		addActor(luna);
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		rotateBy(delta*ROTATION_SPEED);
	}

}
