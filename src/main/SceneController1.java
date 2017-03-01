package main;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.converter.PercentageStringConverter;

import java.io.IOException;
import java.text.DecimalFormat;

/**
 * Created by parker on 2/28/17.
 */
public class SceneController1 {
    public TextField bill;
    public Button button;
    public TextField tipP;
    public Slider slider;
    public TextField tip;
    public TextField total;
    private Stage stage;
    private Parent root;
    DecimalFormat df = new DecimalFormat("#.00");

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

    public void updateTotal() {
        double billAmount = 0;
        double tipPAmount = 0;
        if(bill.getText().length()>0){
            billAmount = Double.parseDouble("0"+bill.getText());
        }
        if(tipP.getText().length()>0){
            tipPAmount = Double.parseDouble("0"+tipP.getText());
        }
        tipPAmount = tipPAmount/100;
        int people = (int)slider.getValue();
        double tipAmount = (billAmount*tipPAmount);
        double totalAmount = (billAmount+tipAmount);
        tipAmount = tipAmount/people;
        totalAmount = totalAmount/people;
        tip.setText("$"+df.format(tipAmount));
        total.setText("$"+df.format(totalAmount));
    }
}
