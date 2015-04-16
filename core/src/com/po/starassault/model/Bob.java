package com.po.starassault.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bob {

    public enum State {
        IDLE, WALKING, JUMPING, DYING
    }

    static final float SPEED = 2f;	// unit per second
    static final float JUMP_VELOCITY = 1f;
    static final float SIZE = 0.5f; // half a unit

    Vector2 	position = new Vector2();
    Vector2 	acceleration = new Vector2();
    Vector2 	velocity = new Vector2();
    Rectangle 	bounds = new Rectangle();
    State		state = State.IDLE;
    boolean		facingLeft = true;

    public Bob(Vector2 position) {
        this.position = position;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return bounds;
    }
}