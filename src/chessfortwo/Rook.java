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
public class Rook extends Figure{
    
    private String img;

    public Rook(boolean white) {
        super(white);
        if(white){
            img = "/images/Chess_WhiteRook.png";
        }else{
            img = "/images/Chess_BlackRook.png";
        }
    }
    
    public String getImg() {
        return img;
    }
    
    @Override
    public boolean validMove(Board board, Position start, Position end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
