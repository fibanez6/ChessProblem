package com.fibanez.chessProblem;

import com.fibanez.chessProblem.model.Board;
import com.fibanez.chessProblem.model.ChessPiece;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Backtracking solution with duplicated chess pieces.
 *
 * @author fibanez
 */
public class ChessProblem {

    private final Board board;
    private final ChessPiece[] pieces;

    public ChessProblem(Board board, ChessPiece[] pieces) {
        this.board = board;
        this.pieces = pieces;
    }

    public void resolve() {
        LinkedList<ChessPiece> buffer = Arrays.stream(pieces).collect(Collectors.toCollection(LinkedList::new));
        Map<String, Point> lastPositionByType = new HashMap<>();
        resolve(buffer,lastPositionByType);
    }

    private void resolve(LinkedList<ChessPiece> buffer, Map<String, Point> lastPositionByType) {
        // solution base
        if (buffer.isEmpty()) {
            board.print();
            return;
        }

        ChessPiece pieceToPut = buffer.pollFirst();
        int startRow = pieceToPut.getRow();
        int startCol = pieceToPut.getCol();

        // if a piece of the same type is already on the board, then the start point
        // of the duplicated piece will be the next position. This saves unnecessary
        // checks and also avoid duplicated results.
        Point lastPos = lastPositionByType.get(pieceToPut.toString());
        if (lastPos != null) {
            startRow = lastPos.x;
            startCol = lastPos.y+1;
        }

        for (int row = startRow; row < board.getNumRows(); row++) {
            for (int col = startCol; col < board.getNumCols(); col++) {
                pieceToPut.setPosition(row, col);

                if (!board.isValid(pieceToPut)) {
                    continue;
                }

                board.putPiece(pieceToPut);

                lastPositionByType.put(pieceToPut.toString(), pieceToPut.getPosition());

                resolve(buffer,lastPositionByType);

                pieceToPut = board.removeLastPiece();
            }
            startCol = 0;
        }

        // returns the removed piece to the buffer
        pieceToPut.setPosition(0,0);
        buffer.addFirst(pieceToPut);
        lastPositionByType.remove(pieceToPut.toString());
    }
}
