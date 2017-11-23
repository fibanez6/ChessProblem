package com.fibanez.chessProblem.model;

import com.fibanez.chessProblem.enums.PieceEnum;

/**
 * @author fibanez
 */
public class Knight extends Piece {

    public Knight() {
        super();
    }

    /**
     * The Knight attacks at a distance of two squares, but not same row, not same column,
     * and not at a distance of one square.
     *
     * @param p
     * @return true if the Knight threats to the input piece
     */
    @Override
    public boolean threatsTo(ChessPiece p) {
        double distance = Math.hypot(p.getRow() - this.getRow(), p.getCol() - this.getCol());
        return  distance < 3
                && this.getRow() != p.getRow()
                && this.getCol() != p.getCol()
                && (Math.abs(p.getRow() - this.getRow()) != Math.abs(p.getCol() - this.getCol()));
    }

    @Override
    public String getSymbol() {
        return PieceEnum.KNIGHT.getSymbol();
    }

    @Override
    public String toString() {
        return PieceEnum.KNIGHT.getName();
    }

}
