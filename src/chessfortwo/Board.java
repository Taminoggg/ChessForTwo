/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessfortwo;

/**
 *
 * @author Tamino
 */
public class Board {
    Position[][] boxes;
  
    public Board()
    {
        this.resetBoard();
    }
  
    public Position getBox(int x, int y) throws Exception
    {
  
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }
  
        return boxes[x][y];
    }
  
    public void resetBoard()
    {
        // initialize black pieces
        boxes[0][0] = new Position(0, 0, new Rook(false));
        boxes[0][1] = new Position(0, 1, new Knight(false));
        boxes[0][2] = new Position(0, 2, new Bishop(false));
        boxes[0][3] = new Position(0, 2, new Queen(false));
        boxes[0][4] = new Position(0, 2, new King(false));
        boxes[0][5] = new Position(0, 2, new Bishop(false));
        boxes[0][6] = new Position(0, 1, new Knight(false));
        boxes[0][7] = new Position(0, 0, new Rook(false));
        boxes[1][0] = new Position(1, 0, new Pawn(false));
        boxes[1][1] = new Position(1, 1, new Pawn(false));
        boxes[1][2] = new Position(1, 1, new Pawn(false));
        boxes[1][3] = new Position(1, 1, new Pawn(false));
        boxes[1][4] = new Position(1, 1, new Pawn(false));
        boxes[1][5] = new Position(1, 1, new Pawn(false));
        boxes[1][6] = new Position(1, 1, new Pawn(false));
        boxes[1][7] = new Position(1, 1, new Pawn(false));
  
        // initialize white pieces
        boxes[0][0] = new Position(0, 0, new Rook(true));
        boxes[0][1] = new Position(0, 1, new Knight(true));
        boxes[0][2] = new Position(0, 2, new Bishop(true));
        boxes[0][3] = new Position(0, 2, new Queen(true));
        boxes[0][4] = new Position(0, 2, new King(true));
        boxes[0][5] = new Position(0, 2, new Bishop(true));
        boxes[0][6] = new Position(0, 1, new Knight(true));
        boxes[0][7] = new Position(0, 0, new Rook(true));
        boxes[6][0] = new Position(6, 0, new Pawn(true));
        boxes[6][1] = new Position(6, 1, new Pawn(true));
        boxes[6][2] = new Position(6, 1, new Pawn(true));
        boxes[6][3] = new Position(6, 1, new Pawn(true));
        boxes[6][4] = new Position(6, 1, new Pawn(true));
        boxes[6][5] = new Position(6, 1, new Pawn(true));
        boxes[6][6] = new Position(6, 1, new Pawn(true));
        boxes[6][7] = new Position(6, 1, new Pawn(true));
  
        // initialize remaining boxes without any piece
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                boxes[i][j] = new Position(i, j, null);
            }
        }
    }
}
