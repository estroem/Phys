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
}
