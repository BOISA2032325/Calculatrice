package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textField;
    @FXML
    private Button buttonAdditionner;
    @FXML
    private Button buttonSoustraction;
    @FXML
    private Button buttonMultiplication;
    @FXML
    private Button buttonDivision;
    @FXML
    private Button buttonCarre;
    @FXML
    private Button buttonRacine;


    public void clicAdditonner(){
        String premierChiffre = textField.getText();
        textField.setText(premierChiffre+"+");
    }

    public void clicSoustraire(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"-");
    }

    public void clicMultiplication(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"*");
    }

    public void clicDivision(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"/");
    }

    public void clicCarre(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"^2");
    }

    public void clicRacine(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"√");
    }
}
