package com.eirikstrom.phys.game;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eirik on 03.11.2017.
 */
public class Game {
    private List<Ball> balls;

    public Game() {
        balls = new ArrayList<Ball>();
        balls.add(new Ball(new Point2D.Double(0.5, 0.5), 10));
    }

    public void update() {
        for(Ball b : balls) {
            b.move(new Point2D.Double(0.01, 0.01));
        }
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
