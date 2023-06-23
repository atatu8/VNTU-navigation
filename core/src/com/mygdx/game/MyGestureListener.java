package com.mygdx.game;

import com.badlogic.gdx.input.GestureDetector.GestureListener;
import com.badlogic.gdx.math.Vector2;

public class MyGestureListener implements GestureListener {

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {

        return false;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {

        return false;
    }

    @Override
    public boolean longPress(float x, float y) {

        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        return false;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        MyGdxGame.x += (int) (deltaX*MyGdxGame.scale/50);
        MyGdxGame.y -= (int) (deltaY*MyGdxGame.scale/50);
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {

        return false;
    }

    @Override
    public boolean zoom(float originalDistance, float currentDistance) {

        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        // Handle the pinch gesture here
        float initialDistance = initialPointer1.dst(initialPointer2);
        float currentDistance = pointer1.dst(pointer2);
        float pinchDelta = currentDistance - initialDistance;

        MyGdxGame.scale -= pinchDelta * 0.0005;

        if(MyGdxGame.scale < 3){
            MyGdxGame.scale = 3;
        }

        if(MyGdxGame.scale > 200){
            MyGdxGame.scale = 200;
        }

        return true;
    }

    @Override
    public void pinchStop() {
    }
}
