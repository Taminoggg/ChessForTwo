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
public class Player {
    
    private static boolean isWhite;
    
    public Player(){
        this.isWhite = false;
    }

    public static boolean getIsWhite() {
        return isWhite;
    }
    
    public void setIsWhite(boolean isWhite){
        this.isWhite = isWhite;
    }
}
