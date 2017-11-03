package com.eirikstrom.phys;

/**
 * Created by Eirik on 03.11.2017.
 */
public class DoublePoint {
    public double x;
    public double y;

    public DoublePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public DoublePoint(DoublePoint p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void translate(DoublePoint d) {
        x += d.x;
        y += d.y;
    }

    public double distance(DoublePoint p) {
        return Math.sqrt(Math.pow(Math.abs(x - p.x), 2) + Math.pow(Math.abs(y - p.y), 2));
    }
}
