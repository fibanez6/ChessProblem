package com.fibanez.chessProblem.model;

import com.fibanez.chessProblem.enums.PieceEnum;

/**
 * @author fibanez
 */
public class King extends Piece {

    public King() {
        super();
    }

    /**
     * The king attacks at a distance of one square
     *
     * @param p
     * @return true if the king threats to the input piece
     */
    public boolean threatsTo(ChessPiece p) {
        double distance = Math.hypot(p.getRow() - this.getRow(), p.getCol() - this.getCol());
        return distance < 2;
    }

    @Override
    public String getSymbol() {
        return PieceEnum.KING.getSymbol();
    }

    @Override
    public String toString() {
        return PieceEnum.KING.getName();
    }
}
