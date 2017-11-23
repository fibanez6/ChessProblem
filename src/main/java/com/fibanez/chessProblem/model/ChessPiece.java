package com.fibanez.chessProblem.model;

import java.awt.*;

/**
 * Interface for chess pieces
 *
 * @author fibanez
 */
public interface ChessPiece {

    String getSymbol();

    void setPosition(int row, int col);

    Point getPosition();

    int getRow();

    int getCol();

    boolean threatsTo(ChessPiece p);

}
