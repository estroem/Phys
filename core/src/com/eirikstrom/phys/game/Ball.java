package com.eirikstrom.phys.game;

import com.eirikstrom.phys.DoublePoint;

import java.awt.geom.Point2D;

/**
 * Created by Eirik on 03.11.2017.
 */
public class Ball {
    private DoublePoint pos;
    private double size;
    private DoublePoint speed;

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
        DoublePoint newPos = new DoublePoint(pos);
        newPos.translate(dist);
        newPos.translate(new DoublePoint(0, -size));

        if(!game.world.contains(newPos)) {
            newPos.translate(new DoublePoint(0, size));
            pos = newPos;
        } else {
            newPos.translate(new DoublePoint(0, size));
            pos.x = newPos.x;
        }
    }

    public void accelerate(DoublePoint dist) {
        speed.translate(dist);
    }

    public double getSize() {
        return size;
    }
}
