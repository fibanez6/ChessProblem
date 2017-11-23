package com.fibanez.chessProblem.model;

import java.awt.*;

/**
 * @author fibanez
 */
public abstract class Piece implements ChessPiece {

    private Point position;

    public Piece() {
        this.position = new Point(0,0);
    }

    public Point getPosition() {
        return this.position;
    }

    public void setPosition(int row, int col) {
        this.position.setLocation(row, col);
    }

    @Override
    public int getRow() {
        return position.x;
    }

    @Override
    public int getCol() {
        return position.y;
    }
}
