package com.fibanez.chessProblem.factory;

import com.fibanez.chessProblem.enums.PieceEnum;
import com.fibanez.chessProblem.model.*;

/**
 * Factory to create Chess Pieces
 *
 * @author fibanez
 */
public class PieceFactory {

    public static ChessPiece create(String symbol) {
        PieceEnum pieceEnum = PieceEnum.getPieceBySymbol(symbol);
        switch (pieceEnum) {
            case KING: return new King();
            case QUEEN: return new Queen();
            case BISHOP: return new Bishop();
            case KNIGHT: return new Knight();
            case ROOK: return new Rook();
        }
        throw new IllegalStateException("Symbol "+symbol+" no valid");
    }
}
