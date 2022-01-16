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
public class Knight extends Figure {

    private String img;
    //2 nach vorne 1 auf seite in beliebige Richtung

    public Knight(boolean white) {
        super(white);
        if (white) {
            img = "/images/Chess_WhiteKnight.png";
        } else {
            img = "/images/Chess_BlackKnight.png";
        }
    }

    public String getImg() {
        return img;
    }

    @Override
    public boolean validMove(Board board, Position start, Position end) {
        //check if Field is free
        boolean canMove = false;
            for (int i = -1; i < 2; i = i + 2) {
                if (start.getX()+i == end.getX() && start.getY()+2 == end.getY()) {
                    canMove = true;
                    end.setX(start.getX()+i);
                    end.setY(start.getY()+2);
                }
                if(start.getX()+i == end.getX() && start.getY()-2 == end.getY()){
                    canMove = true;
                    end.setX(start.getX()+i);
                    end.setY(start.getY()-2);
                }
                if(start.getX()+2 == end.getX() && start.getY()+i == end.getY()){
                    canMove = true;
                    end.setX(start.getX()+2);
                    end.setY(start.getY()+i);
                }
                if(start.getX()-2 == end.getX() && start.getY()+i == end.getY()){
                    canMove = true;
                    end.setX(start.getX()-2);
                    end.setY(start.getY()+i);
                }
            }
        return canMove;
    }
}
