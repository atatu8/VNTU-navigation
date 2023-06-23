package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.input.GestureDetector;

public class MyGdxGame extends ApplicationAdapter {
	static float scale = 3;
	static int x = 0;
	static int y = 0;
	private GestureDetector gestureDetector;
	static boolean costyl = false;
	float w;
	float h;

	@Override
	public void create() {
		MyGestureListener gestureListener = new MyGestureListener();

		gestureDetector = new GestureDetector(gestureListener);
		Gdx.input.setInputProcessor(gestureDetector);

		w = Gdx.graphics.getWidth();
		h = Gdx.graphics.getHeight();
	}

	@Override
	public void render() {

		ScreenUtils.clear(1, 1, 0, 1);
	}

	@Override
	public void dispose() {

	}

	public void test(int i){

	}

}
