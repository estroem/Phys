package com.eirikstrom.phys.game;

import com.eirikstrom.phys.DoublePoint;

/**
 * Created by Eirik on 03.11.2017.
 */
public class World {
    double floorHeight;

    public World(double floorHeight) {
        this.floorHeight = floorHeight;
    }

    public boolean contains(DoublePoint p) {
        return p.y <= floorHeight;
    }

    public double getFloorHeight() {
        return floorHeight;
    }
}
