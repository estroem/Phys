package com.eirikstrom.phys.game;

import com.eirikstrom.phys.DoublePoint;

import java.awt.geom.Point2D;

/**
 * Created by Eirik on 03.11.2017.
 */
public class Ball extends Shape {
    private DoublePoint pos;
    private DoublePoint speed;
    private double size;

    private Game game;

    public Ball(Game game, DoublePoint pos, DoublePoint speed, double size) {
        this.game = game;
        this.pos = pos;
        this.speed = speed;
        this.size = size;
    }

    public void update() {
        move(speed);
    }

    public DoublePoint getCoords() {
        return pos;
    }

    public void move(DoublePoint dist) {
        pos.translate(dist);

        if(checkCollision(game.getFloor())) {
            pos.y = game.getFloor().getHeight() + size;
            speed.y = -speed.y;
        }
    }

    public void accelerate(DoublePoint dist) {
        speed.translate(dist);
    }

    public double getSize() {
        return size;
    }

    public boolean checkCollision(Shape other) {
        if(other == this)
            return false;

        if(other instanceof Ball) {
            return pos.distance(((Ball) other).pos) < (size + ((Ball) other).size);
        }

        else if(other instanceof Floor) {
            return pos.y - size <= ((Floor) other).getHeight();
        }

        return false;
    }
}
