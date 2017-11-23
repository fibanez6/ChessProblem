package com.fibanez.chessProblem.model;

import com.fibanez.chessProblem.enums.PieceEnum;

/**
 * @author fibanez
 */
public class Bishop extends Piece {

    public Bishop() {
        super();
    }

    /**
     * The Bishop attacks in diagonals.
     *
     * @param p
     * @return true if the Bishop threats to the input piece
     */
    @Override
    public boolean threatsTo(ChessPiece p) {
        return Math.abs(p.getRow() - this.getRow()) == Math.abs(p.getCol() - this.getCol());
    }

    @Override
    public String getSymbol() {
        return PieceEnum.BISHOP.getSymbol();
    }


    @Override
    public String toString() {
        return PieceEnum.BISHOP.getName();
    }

}
