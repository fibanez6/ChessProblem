package com.fibanez.chessProblem.model;

import com.fibanez.chessProblem.enums.PieceEnum;

/**
 * @author fibanez
 */
public class Queen extends Piece {

    public Queen() {
        super();
    }

    /**
     * The Queen attacks to the same row, same column, and diagonals.
     *
     * @param p
     * @return true if the Queens threats to the input piece
     */
    @Override
    public boolean threatsTo(ChessPiece p) {
        return this.getRow() == p.getRow()
                || p.getCol() == this.getCol()
                || (Math.abs(p.getRow() - this.getRow()) == Math.abs(p.getCol() - this.getCol()));
    }

    @Override
    public String getSymbol() {
        return PieceEnum.QUEEN.getSymbol();
    }

    @Override
    public String toString() {
        return PieceEnum.QUEEN.getName();
    }

}
