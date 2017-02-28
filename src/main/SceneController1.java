package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by parker on 2/28/17.
 */
public class SceneController1 {
    @FXML
    private Button button;
    private Stage stage;
    private Parent root;

    public void handleButtonClick() throws IOException {
        changeScene("sample.fxml","Grid Pane");

    }

    private void changeScene(String link, String title) throws IOException{
        stage=(Stage) button.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource(link));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
}
