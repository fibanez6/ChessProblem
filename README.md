# CHESS PROBLEM

The problem is to find all unique configurations of a set of normal chess pieces on a chess board
with dimensions M×N where none of the pieces is in a position to take any of the others. Assume
the colour of the piece does not matter, and that there are no pawns among the pieces.

Write a program which takes as input:

- The dimensions of the board: M, N.
- The number of pieces of each type (King, Queen, Bishop, Rook and Knight) to try and place on the board.

As output, the program should list all the unique configurations to the console for which all of the
pieces can be placed on the board without threatening each other.

When returning your solution, please provide with your answer the total number of unique configurations
for a 7×7 board with 2 Kings, 2 Queens, 2 Bishops and 1 Knight.

### Examples
Input: 3×3 board containing 2 Kings and 1 Rook.
Output:

<image>

Input: 4×4 board containing 2 Rooks and 4 Knights.
Output:

<image>


## REQUIREMENTS
* Java 8
* Maven
* GIT

## Installation

```
  > git pull git@github.com:fibanez6/ChessProblem.git
  > cd ChessProblem
  > mvn clean install
```

## Execution

```
  > java -jar target/chessProblem-1.0-SNAPSHOT.jar
3 3
Number of Kings pieces: 2
Number of Queens pieces: 0
Number of Bishop pieces: 0
Number of Knight pieces: 0
Number of Rook pieces: 1
-
 K  *  K
 *  *  *
 *  R  *
-
 K  *  *
 *  *  R
 K  *  *
-
 *  *  K
 R  *  *
 *  *  K
-
 *  R  *
 *  *  *
 K  *  K

```




