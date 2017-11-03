package com.eirikstrom.phys.game;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Eirik on 03.11.2017.
 */
public class Ball {
    private Point2D.Double pos;
    private int size;

    public Ball(Point2D.Double pos, int size) {
        this.pos = pos;
        this.size = size;
    }

    public Point2D.Double getCoords() {
        return pos;
    }

    public void move(Point2D.Double dist) {
        pos = new Point2D.Double(pos.x + dist.x, pos.y + dist.y);
    }

    public int getSize() {
        return size;
    }
}
