package com.eirikstrom.phys.game;

/**
 * Created by Eirik on 03.11.2017.
 */
public class Floor extends Shape {
    private double height;

   public Floor(double height) {
       this.height = height;
   }

   public double getHeight() {
       return this.height;
   }
}