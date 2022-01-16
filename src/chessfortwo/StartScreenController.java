/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessfortwo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


/**
 *
 * @author Tamino
 */
public class StartScreenController implements Initializable {
    
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //BackgroundImage myBI= new BackgroundImage(new Image("/images/chess-playing-hand.jpeg"),
        //BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          //BackgroundSize.DEFAULT);
        
        //Image img = new Image(getClass().getResourceAsStream("/images/chess-playing-hand.jpeg"));
        //ImageView imageView = new ImageView(img);
        //anchorPane.setBackground(new Background(myBI));
        
    }

    private void openNextWindow(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WaitForPlayersScreen.fxml"));
            Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(StartScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void handlePlay(ActionEvent event) {
        openNextWindow(event);
    }

    @FXML
    private void handleExit(ActionEvent event) {
        Platform.exit();
    }
    
    public void setPrimaryStage(Stage stage) {
        this.stage = stage;
    }
}

//                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocumentNeuesFenster.fxml"));
//                Parent root = (Parent) loader.load();
//                FXMLDocumentNeuesFensterController d = new FXMLDocumentNeuesFensterController(clubName.getText(), password.getText());
//
//                Scene scene = new Scene(root);
//                stage.setScene(scene);
//                stage.show();