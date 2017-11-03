package com.eirikstrom.phys.gui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.eirikstrom.phys.DoublePoint;
import com.eirikstrom.phys.game.Ball;
import com.eirikstrom.phys.game.Game;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by Eirik on 03.11.2017.
 */
public class GUI {
    SpriteBatch batch;
    Game game;
    Pixmap pixmap;
    int width;
    int height;

    public GUI(SpriteBatch sb, Game game) {
        this.batch = sb;
        this.game = game;
    }

    public void render() {
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();

        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        pixmap = new Pixmap(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), Pixmap.Format.Alpha);

        drawWorld();
        drawBalls();

        Texture texture = new Texture(pixmap);

        batch.begin();
        batch.draw(texture, 0, 0);
        batch.end();
    }

    private void drawWorld() {
        Point from = getCoords(new DoublePoint(0, game.world.getFloorHeight()));
        Point to = getCoords(new DoublePoint(1, game.world.getFloorHeight()));

        pixmap.setColor(Color.GRAY);
        pixmap.drawLine(from.x, from.y, to.x, to.y);
    }

    private void drawBalls() {
        for(Ball b : game.getBalls()) {
            drawBall(b.getCoords(), b.getSize());
        }
    }

    private void drawBall(DoublePoint p, double radius) {
        Point translatedP = getCoords(p);

        pixmap.setColor(Color.BLACK);
        pixmap.fillCircle(translatedP.x, translatedP.y, (int)(radius*width));
    }

    private Point getCoords(DoublePoint fp) {
        return new Point((int) (fp.x * width), (int) ((1-fp.y) * height));
    }
}
