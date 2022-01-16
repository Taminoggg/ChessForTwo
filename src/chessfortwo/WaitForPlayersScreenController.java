/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessfortwo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tamino
 */
public class WaitForPlayersScreenController implements Initializable {

    private Stage stage;
    @FXML
    private Label txtPlayerOne;
    @FXML
    private Label txtStartingInfo;
    @FXML
    private Label txtTimeUntilStart;
    @FXML
    private Label txtPlayerTwo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private void openNextWindow(ActionEvent event) {

        txtStartingInfo.setText("Game is starting...");
//        for(int i=0;i<5;i++){
//            TimeUnit.SECONDS.sleep(1);
//            txtTimeUntilStart.setText(String.valueOf(i+1));
//        }

        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("PlayScreen.fxml"));
            Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(StartScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPrimaryStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void btnNextSite(ActionEvent event) throws IOException, InterruptedException {
        openNextWindow(event);
    }
}
