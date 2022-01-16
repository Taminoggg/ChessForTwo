/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessfortwo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Tamino
 */
public class PlayScreenController implements Initializable {

    private boolean startFieldChosen;

    @FXML
    private GridPane chessBoardView;
    @FXML
    private Pane pane00;
    @FXML
    private Pane pane01;
    @FXML
    private Pane pane02;
    @FXML
    private Pane pane03;
    @FXML
    private Pane pane04;
    @FXML
    private Pane pane05;
    @FXML
    private Pane pane06;
    @FXML
    private Pane pane07;
    @FXML
    private Pane pane10;
    @FXML
    private Pane pane11;
    @FXML
    private Pane pane12;
    @FXML
    private Pane pane13;
    @FXML
    private Pane pane14;
    @FXML
    private Pane pane15;
    @FXML
    private Pane pane16;
    @FXML
    private Pane pane17;
    @FXML
    private Pane pane20;
    @FXML
    private Pane pane21;
    @FXML
    private Pane pane22;
    @FXML
    private Pane pane23;
    @FXML
    private Pane pane24;
    @FXML
    private Pane pane25;
    @FXML
    private Pane pane26;
    @FXML
    private Pane pane27;
    @FXML
    private Pane pane30;
    @FXML
    private Pane pane31;
    @FXML
    private Pane pane32;
    @FXML
    private Pane pane33;
    @FXML
    private Pane pane34;
    @FXML
    private Pane pane35;
    @FXML
    private Pane pane36;
    @FXML
    private Pane pane37;
    @FXML
    private Pane pane40;
    @FXML
    private Pane pane41;
    @FXML
    private Pane pane42;
    @FXML
    private Pane pane43;
    @FXML
    private Pane pane44;
    @FXML
    private Pane pane45;
    @FXML
    private Pane pane46;
    @FXML
    private Pane pane47;
    @FXML
    private Pane pane50;
    @FXML
    private Pane pane51;
    @FXML
    private Pane pane52;
    @FXML
    private Pane pane53;
    @FXML
    private Pane pane54;
    @FXML
    private Pane pane55;
    @FXML
    private Pane pane56;
    @FXML
    private Pane pane57;
    @FXML
    private Pane pane60;
    @FXML
    private Pane pane61;
    @FXML
    private Pane pane62;
    @FXML
    private Pane pane63;
    @FXML
    private Pane pane64;
    @FXML
    private Pane pane65;
    @FXML
    private Pane pane66;
    @FXML
    private Pane pane67;
    @FXML
    private Pane pane70;
    @FXML
    private Pane pane71;
    @FXML
    private Pane pane72;
    @FXML
    private Pane pane73;
    @FXML
    private Pane pane74;
    @FXML
    private Pane pane75;
    @FXML
    private Pane pane76;
    @FXML
    private Pane pane77;
    
    private int playersTurnCounter = 0;
    private boolean player1Turn = true;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        boolean isWhite = Player.getIsWhite();
        
        Rook player2Rook = new Rook(!isWhite);
        Knight player2Knight = new Knight(!isWhite);
        Bishop player2Bishop = new Bishop(!isWhite);
        Queen player2Queen = new Queen(!isWhite);
        King player2King = new King(!isWhite);
        Pawn player2Pawn = new Pawn(!isWhite);

        Rook player1Rook = new Rook(isWhite);
        Knight player1Knight = new Knight(isWhite);
        Bishop player1Bishop = new Bishop(isWhite);
        Queen player1Queen = new Queen(isWhite);
        King player1King = new King(isWhite);
        Pawn player1Pawn = new Pawn(isWhite);

        Image blackRookImg1 = new Image(getClass().getResourceAsStream(player2Rook.getImg()));
        ImageView blackRookImageView1 = new ImageView(blackRookImg1);
        Image blackRookImg2 = new Image(getClass().getResourceAsStream(player2Rook.getImg()));
        ImageView blackRookImageView2 = new ImageView(blackRookImg2);   
        Image blackKnightImg1 = new Image(getClass().getResourceAsStream(player2Knight.getImg()));
        ImageView blackKnightImageView1 = new ImageView(blackKnightImg1);
        Image blackKnightImg2 = new Image(getClass().getResourceAsStream(player2Knight.getImg()));
        ImageView blackKnightImageView2 = new ImageView(blackKnightImg2);
        Image blackBishopImg1 = new Image(getClass().getResourceAsStream(player2Bishop.getImg()));
        ImageView blackBishopImageView1 = new ImageView(blackBishopImg1);
        Image blackBishopImg2 = new Image(getClass().getResourceAsStream(player2Bishop.getImg()));
        ImageView blackBishopImageView2 = new ImageView(blackBishopImg2);
        Image blackQueenImg = new Image(getClass().getResourceAsStream(player2Queen.getImg()));
        ImageView blackQueenImageView = new ImageView(blackQueenImg);    
        Image blackKingImg = new Image(getClass().getResourceAsStream(player2King.getImg()));
        ImageView blackKingImageView = new ImageView(blackKingImg);
        Image blackPawnImg1 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView1 = new ImageView(blackPawnImg1);
        Image blackPawnImg2 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView2 = new ImageView(blackPawnImg2);
        Image blackPawnImg3 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView3 = new ImageView(blackPawnImg3);
        Image blackPawnImg4 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView4 = new ImageView(blackPawnImg4);
        Image blackPawnImg5 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView5 = new ImageView(blackPawnImg5);
        Image blackPawnImg6 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView6 = new ImageView(blackPawnImg6);
        Image blackPawnImg7 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView7 = new ImageView(blackPawnImg7);
        Image blackPawnImg8 = new Image(getClass().getResourceAsStream(player2Pawn.getImg()));
        ImageView blackPawnImageView8 = new ImageView(blackPawnImg8);
        
        Image whiteRookImg1 = new Image(getClass().getResourceAsStream(player1Rook.getImg()));
        ImageView whiteRookImageView1 = new ImageView(whiteRookImg1);
        Image whiteRookImg2 = new Image(getClass().getResourceAsStream(player1Rook.getImg()));
        ImageView whiteRookImageView2 = new ImageView(whiteRookImg2);   
        Image whiteKnightImg1 = new Image(getClass().getResourceAsStream(player1Knight.getImg()));
        ImageView whiteKnightImageView1 = new ImageView(whiteKnightImg1);
        Image whiteKnightImg2 = new Image(getClass().getResourceAsStream(player1Knight.getImg()));
        ImageView whiteKnightImageView2 = new ImageView(whiteKnightImg2);
        Image whiteBishopImg1 = new Image(getClass().getResourceAsStream(player1Bishop.getImg()));
        ImageView whiteBishopImageView1 = new ImageView(whiteBishopImg1);
        Image whiteBishopImg2 = new Image(getClass().getResourceAsStream(player1Bishop.getImg()));
        ImageView whiteBishopImageView2 = new ImageView(whiteBishopImg2);
        Image whiteQueenImg = new Image(getClass().getResourceAsStream(player1Queen.getImg()));
        ImageView whiteQueenImageView = new ImageView(whiteQueenImg);    
        Image whiteKingImg = new Image(getClass().getResourceAsStream(player1King.getImg()));
        ImageView whiteKingImageView = new ImageView(whiteKingImg);
        Image whitePawnImg1 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView1 = new ImageView(whitePawnImg1);
        Image whitePawnImg2 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView2 = new ImageView(whitePawnImg2);
        Image whitePawnImg3 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView3 = new ImageView(whitePawnImg3);
        Image whitePawnImg4 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView4 = new ImageView(whitePawnImg4);
        Image whitePawnImg5 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView5 = new ImageView(whitePawnImg5);
        Image whitePawnImg6 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView6 = new ImageView(whitePawnImg6);
        Image whitePawnImg7 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView7 = new ImageView(whitePawnImg7);
        Image whitePawnImg8 = new Image(getClass().getResourceAsStream(player1Pawn.getImg()));
        ImageView whitePawnImageView8 = new ImageView(whitePawnImg8);
        
        pane01.getChildren().clear();
        pane04.getChildren().clear();
        pane00.getChildren().add(blackRookImageView1);
        pane01.getChildren().add(blackKnightImageView1);
        pane02.getChildren().add(blackBishopImageView1);
        pane03.getChildren().add(blackQueenImageView);
        pane04.getChildren().add(blackKingImageView);
        pane05.getChildren().add(blackBishopImageView2);
        pane06.getChildren().add(blackKnightImageView2);
        pane07.getChildren().add(blackRookImageView2);
        pane10.getChildren().add(blackPawnImageView1);
        pane11.getChildren().add(blackPawnImageView2);
        pane12.getChildren().add(blackPawnImageView3);
        pane13.getChildren().add(blackPawnImageView4);
        pane14.getChildren().add(blackPawnImageView5);
        pane15.getChildren().add(blackPawnImageView6);
        pane16.getChildren().add(blackPawnImageView7);
        pane17.getChildren().add(blackPawnImageView8);
        
        pane70.getChildren().add(whiteRookImageView1);
        pane71.getChildren().add(whiteKnightImageView1);
        pane72.getChildren().add(whiteBishopImageView1);
        pane73.getChildren().add(whiteQueenImageView);
        pane74.getChildren().add(whiteKingImageView);
        pane75.getChildren().add(whiteBishopImageView2);
        pane76.getChildren().add(whiteKnightImageView2);
        pane77.getChildren().add(whiteRookImageView2);
        pane60.getChildren().add(whitePawnImageView1);
        pane61.getChildren().add(whitePawnImageView2);
        pane62.getChildren().add(whitePawnImageView3);
        pane63.getChildren().add(whitePawnImageView4);
        pane64.getChildren().add(whitePawnImageView5);
        pane65.getChildren().add(whitePawnImageView6);
        pane66.getChildren().add(whitePawnImageView7);
        pane67.getChildren().add(whitePawnImageView8);
        


//        Test
//        ObservableList<Node> workingCollection = FXCollections.observableArrayList(chessBoardView.getChildren());
//        Collections.swap(workingCollection, 1, 2);
//        chessBoardView.getChildren().setAll(workingCollection);
    }
    
    //Button end turn
    
    private void switchPlayersTurn(){
        playersTurnCounter++;
        if(playersTurnCounter%2==0){
            player1Turn = true;
        }else{
            player1Turn = false;
        }
    }

    @FXML
    private void fieldChosen00(MouseEvent event) {
    }

    @FXML
    private void fieldChosen01(MouseEvent event) {
    }

    @FXML
    private void fieldChosen02(MouseEvent event) {
    }

    @FXML
    private void fieldChosen03(MouseEvent event) {
    }

    @FXML
    private void fieldChosen04(MouseEvent event) {
    }

    @FXML
    private void fieldChosen05(MouseEvent event) {
    }

    @FXML
    private void fieldChosen06(MouseEvent event) {
    }

    @FXML
    private void fieldChosen07(MouseEvent event) {
    }

    @FXML
    private void fieldChosen10(MouseEvent event) {
    }

    @FXML
    private void fieldChosen11(MouseEvent event) {
    }

    @FXML
    private void fieldChosen12(MouseEvent event) {
    }

    @FXML
    private void fieldChosen13(MouseEvent event) {
    }

    @FXML
    private void fieldChosen14(MouseEvent event) {
    }

    @FXML
    private void fieldChosen15(MouseEvent event) {
    }

    @FXML
    private void fieldChosen16(MouseEvent event) {
    }

    @FXML
    private void fieldChosen17(MouseEvent event) {
    }

    @FXML
    private void fieldChosen20(MouseEvent event) {
    }

    @FXML
    private void fieldChosen21(MouseEvent event) {
    }

    @FXML
    private void fieldChosen22(MouseEvent event) {
    }

    @FXML
    private void fieldChosen23(MouseEvent event) {
    }

    @FXML
    private void fieldChosen24(MouseEvent event) {
    }

    @FXML
    private void fieldChosen25(MouseEvent event) {
    }

    @FXML
    private void fieldChosen26(MouseEvent event) {
    }

    @FXML
    private void fieldChosen27(MouseEvent event) {
    }

    @FXML
    private void fieldChosen30(MouseEvent event) {
    }

    @FXML
    private void fieldChosen31(MouseEvent event) {
    }

    @FXML
    private void fieldChosen32(MouseEvent event) {
    }

    @FXML
    private void fieldChosen33(MouseEvent event) {
    }

    @FXML
    private void fieldChosen34(MouseEvent event) {
    }

    @FXML
    private void fieldChosen35(MouseEvent event) {
    }

    @FXML
    private void fieldChosen36(MouseEvent event) {
    }

    @FXML
    private void fieldChosen37(MouseEvent event) {
    }

    @FXML
    private void fieldChosen40(MouseEvent event) {
    }

    @FXML
    private void fieldChosen41(MouseEvent event) {
    }

    @FXML
    private void fieldChosen42(MouseEvent event) {
    }

    @FXML
    private void fieldChosen43(MouseEvent event) {
    }

    @FXML
    private void fieldChosen44(MouseEvent event) {
    }

    @FXML
    private void fieldChosen45(MouseEvent event) {
    }

    @FXML
    private void fieldChosen46(MouseEvent event) {
    }

    @FXML
    private void fieldChosen47(MouseEvent event) {
    }

    @FXML
    private void fieldChosen50(MouseEvent event) {
    }

    @FXML
    private void fieldChosen51(MouseEvent event) {
    }

    @FXML
    private void fieldChosen52(MouseEvent event) {
    }

    @FXML
    private void fieldChosen53(MouseEvent event) {
    }

    @FXML
    private void fieldChosen54(MouseEvent event) {
    }

    @FXML
    private void fieldChosen55(MouseEvent event) {
    }

    @FXML
    private void fieldChosen56(MouseEvent event) {
    }

    @FXML
    private void fieldChosen57(MouseEvent event) {
    }

    @FXML
    private void fieldChosen60(MouseEvent event) {
    }

    @FXML
    private void fieldChosen61(MouseEvent event) {
    }

    @FXML
    private void fieldChosen62(MouseEvent event) {
    }

    @FXML
    private void fieldChosen63(MouseEvent event) {
    }

    @FXML
    private void fieldChosen64(MouseEvent event) {
    }

    @FXML
    private void fieldChosen65(MouseEvent event) {
    }

    @FXML
    private void fieldChosen66(MouseEvent event) {
    }

    @FXML
    private void fieldChosen67(MouseEvent event) {
    }

    @FXML
    private void fieldChosen70(MouseEvent event) {
    }

    @FXML
    private void fieldChosen71(MouseEvent event) {
    }

    @FXML
    private void fieldChosen72(MouseEvent event) {
    }

    @FXML
    private void fieldChosen73(MouseEvent event) {
    }

    @FXML
    private void fieldChosen74(MouseEvent event) {
    }

    @FXML
    private void fieldChosen75(MouseEvent event) {
    }

    @FXML
    private void fieldChosen76(MouseEvent event) {
    }

    @FXML
    private void fieldChosen77(MouseEvent event) {
    }

}
