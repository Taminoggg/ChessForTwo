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
public class King extends Figure{
    
    private String img;

    public King(boolean white) {
        super(white);
        if(white){
            img = "/images/Chess_WhiteKing.png";
        }else{
            img = "/images/Chess_BlackKing.png";
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
