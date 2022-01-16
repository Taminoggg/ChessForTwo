
package chessfortwo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Tamino
 */
public class ChessForTwo extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StartScreen.fxml"));
        Parent root = (Parent) loader.load();
        StartScreenController controller_1 = (StartScreenController) loader.getController();
        
        controller_1.setPrimaryStage(stage);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
