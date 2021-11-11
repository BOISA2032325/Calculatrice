package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button buttonAdditionner;
    @FXML
    private Button buttonSoustraction;
    @FXML
    private TextField textField;

    public void clicAdditonner(){
        String premierChiffre = textField.getText();
        textField.setText(premierChiffre+"+");
    }

    public void clicSoustraire(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"-");
    }
}
