package com.celfiro.main;

import com.badlogic.gdx.Game;
import com.celfiro.scene.SceneTitle;


public class Celfiro extends Game {
	
	@Override
	public void create() {		
		setScreen(new SceneTitle(this));
	}
}
