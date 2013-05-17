package com.celfiro.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Celfiro";
		cfg.useGL20 = true;
		cfg.width = 600;
		cfg.height = 480;
		
		new LwjglApplication(new Celfiro(), cfg);
	}
}
