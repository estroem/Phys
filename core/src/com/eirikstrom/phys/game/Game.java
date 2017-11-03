package com.eirikstrom.phys.game;

import com.eirikstrom.phys.DoublePoint;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eirik on 03.11.2017.
 */
public class Game {
    public static double GRAVITY = -0.0003;

    public Floor floor;

    private List<Ball> balls;

    public Game() {
        floor = new Floor(0.2);

        balls = new ArrayList<Ball>();
        balls.add(new Ball(this, new DoublePoint(0.1, 0.4), new DoublePoint(0.005, 0), 0.01));
    }

    public void update() {
        for(Ball b : balls) {
            b.accelerate(new DoublePoint(0, GRAVITY));
            b.update();
        }
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public Floor getFloor() {
        return floor;
    }
}
