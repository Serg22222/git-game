package com.mygdx.game.desktop;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		//	System.getProperties().list(System.out);
		System.setProperty("user.name", "Serega");
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "My game";
		config.width = 1024;
		config.height = 768;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
