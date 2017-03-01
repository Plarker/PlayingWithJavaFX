package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML private Button button1;
    @FXML private Button button2;
    private Stage stage;
    private Parent root;

    public void handleButtonClick1() throws IOException{
        changeScene("scene1.fxml","Tip Calculator");

    }

    public void handleButtonClick2() throws IOException{
        changeScene("scene2.fxml","Scene 2");
    }

    private void changeScene(String link, String title) throws IOException{
        stage=(Stage) button1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource(link));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

}
