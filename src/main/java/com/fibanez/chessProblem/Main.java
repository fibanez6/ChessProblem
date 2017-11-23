package com.fibanez.chessProblem;

import com.fibanez.chessProblem.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author fibanez
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the board size NxM i.e. 3 3");
        int rows = in.nextInt();
        int cols = in.nextInt();

        ChessPiece[] pieces = getConfig(in);

        in.close();

        Board board = new Board(rows,cols);

        ChessProblem problem = new ChessProblem(board, pieces);
        problem.resolve();
    }

    private static ChessPiece[] getConfig(Scanner in) {
        System.out.print("Number of Kings pieces: " );
        int kings = in.nextInt();
        System.out.print("Number of Queens pieces: " );
        int queens = in.nextInt();
        System.out.print("Number of Bishop pieces: " );
        int bishop = in.nextInt();
        System.out.print("Number of Knight pieces: " );
        int knight = in.nextInt();
        System.out.print("Number of Rook pieces: " );
        int rook = in.nextInt();
        System.out.println();


        List<ChessPiece> pieces = new ArrayList<>();
        for (int i = 0; i < kings; i++) {
            pieces.add(new King());
        }
        for (int i = 0; i < queens; i++) {
            pieces.add(new Queen());
        }
        for (int i = 0; i < bishop; i++) {
            pieces.add(new Bishop());
        }
        for (int i = 0; i < knight; i++) {
            pieces.add(new Knight());
        }
        for (int i = 0; i < rook; i++) {
            pieces.add(new Rook());
        }

        return pieces.toArray(new ChessPiece[pieces.size()]);
    }

}
