package com.fibanez.chessProblem.enums;

/**
 * @author fibanez
 */
public enum PieceEnum {

    KING("king", "K"),
    QUEEN("queen", "Q"),
    BISHOP("bishop", "B"),
    ROOK("rook", "R"),
    KNIGHT("knight", "N"),
    BLANK("blank", "*");

    private final String name;
    private final String symbol;

    PieceEnum(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public static PieceEnum getPieceBySymbol(String symbol) {
        for(PieceEnum p : values()){
            if( p.getSymbol().equals(symbol)){
                return p;
            }
        }
        return null;
    }
}
