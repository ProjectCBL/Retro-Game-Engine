package com.retro.engine.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.retro.engine.Game;

import static com.retro.engine.util.Globals.*;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = gameTitle;
		config.width = screenWidth;
		config.height = screenHeight;
		new LwjglApplication(new Game(), config);
	}
}
