package com.retro.engine;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Game extends ApplicationAdapter {
	Engine engine = Engine.getInstance();
	
	@Override
	public void create () {
		engine.setUp();
	}

	@Override
	public void render () {
		float dt = Gdx.graphics.getDeltaTime();
		ScreenUtils.clear(1, 0, 0, 1);
		engine.run(dt);
	}
	
	@Override
	public void dispose () {
		engine.dispose();
	}
}
