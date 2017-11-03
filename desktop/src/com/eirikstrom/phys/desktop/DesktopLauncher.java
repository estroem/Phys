package com.eirikstrom.phys.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.eirikstrom.phys.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Phys";
		config.height = 1000;
		config.width = 1000;
		config.initialBackgroundColor = Color.WHITE;

		new LwjglApplication(new Main(), config);
	}
}
