package com.fibanez.chessProblem.model;

import com.fibanez.chessProblem.enums.PieceEnum;

/**
 * @author fibanez
 */
public class Rook extends Piece {

    public Rook() {
        super();
    }

    /**
     * The Rook attacks to the same row and same column.
     *
     * @param p
     * @return true if the Rook threats to the input piece
     */
    @Override
    public boolean threatsTo(ChessPiece p) {
        return p.getRow() == this.getRow() || p.getCol() == this.getCol();
    }

    @Override
    public String getSymbol() {
        return PieceEnum.ROOK.getSymbol();
    }

    @Override
    public String toString() {
        return PieceEnum.ROOK.getName();
    }


}
