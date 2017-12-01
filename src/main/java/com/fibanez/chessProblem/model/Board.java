package com.fibanez.chessProblem.model;

import com.fibanez.chessProblem.enums.PieceEnum;

import java.util.Arrays;
import java.util.Stack;

/**
 * Chess board
 * Include a stack of the pieces to remove pieces in order inverse of insertion.
 *
 * @author fibanez
 */
public class Board {

    private final int numRows;
    private final int numCols;
    private final ChessPiece[][] board;
    private final Stack<ChessPiece> piecesOnBoard;

    public Board(int nRows, int nCols) {
        this.numRows = nRows;
        this.numCols = nCols;
        this.board = new ChessPiece[nRows][nCols];
        this.piecesOnBoard = new Stack<>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void putPiece(ChessPiece piece) {
        if (piece == null) {
            return;
        }
        if (piece.getRow() < 0 || piece.getCol() < 0) {
            return;
        }
        if (piece.getRow() >= numRows || piece.getCol() >= numCols) {
            return;
        }
        this.board[piece.getRow()][piece.getCol()] = piece;
        this.piecesOnBoard.push(piece);
    }

    public ChessPiece removeLastPiece() {
        ChessPiece piece = piecesOnBoard.pop();
        this.board[piece.getRow()][piece.getCol()] = null;
        return piece;
    }

    public boolean isValid(ChessPiece pieceToPut) {
        if (piecesOnBoard.isEmpty()) {
            return true;
        }
        if (board[pieceToPut.getRow()][pieceToPut.getCol()] != null)
            return false;
        for (ChessPiece piece: piecesOnBoard) {
            if (piece.threatsTo(pieceToPut) || pieceToPut.threatsTo(piece)) {
                return false;
            }
        }
        return true;
    }

    public void print() {
        System.out.println("-");
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(board)
                .forEach(
                        (row) -> {
                            Arrays.stream(row)
                                    .forEach(
                                            (el) -> {
                                                String symbol = (el == null) ? PieceEnum.BLANK.getSymbol() : el.getSymbol();
                                                sb.append(" " + symbol + " ");
                                            });
                            sb.append(System.lineSeparator());
                        }
                );
        return sb.toString();
    }
}
