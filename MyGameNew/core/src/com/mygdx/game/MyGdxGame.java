package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	//private OrthographicCamera camera;
	//private Sprite sprite;
	//private TextureRegion region;
	private SpriteBatch batch;
	private Texture img;
	float h;
	float w;
	
	@Override
	public void create () {
		h = Gdx.graphics.getHeight();
		w = Gdx.graphics.getWidth();
		batch = new SpriteBatch();
		img = new Texture("badlogic1.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, h/2, w/2);
		batch.end();
	}

	@Override
	public void dispose(){
		batch.dispose();
		img.dispose();
	}
}
