package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

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
    @FXML
    private Button buttonInverse;
    @FXML
    private Button buttonNegatif;
    @FXML
    private Button buttonEffacer;
    @FXML
    private Button buttonEgal;
    @FXML
    private Menu menuStandard;
    @FXML
    private Menu menuScientifique;
    @FXML
    private Menu menuConversion;
    @FXML
    private FlowPane flowPane;
    @FXML
    private GridPane gridPane;



    public void clicMenuStandard(){
        gridPane.add(flowPane,1,1);
    }

    public void clicMenuScientifique(){

    }

    public void clicMenuConversion(){

    }


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

    public void clicInverse(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"1/");
    }

    public void clicNegatif(){
        String chiffre = textField.getText();
        textField.setText(chiffre+"-");
    }

    public void clicEffacer(){
        textField.clear();
    }

    public void calculMoin(){
        String[] parts = textField.getText().split("-");
        String carac1 = parts[0];
        String carac2 = parts[1];
        double resultat1 = Integer.parseInt(carac1);
        double resultat2 = Integer.parseInt(carac2);
        double resultat = resultat1 - resultat2;
        textField.setText(String.valueOf(resultat));
    }

    public void calculPlus(){
        String[] parts = textField.getText().split("\\+");
        String carac1 = parts[0];
        String carac2 = parts[1];
        double resultat1 = Integer.parseInt(carac1);
        double resultat2 = Integer.parseInt(carac2);
        double resultat = resultat1 + resultat2;
        textField.setText(String.valueOf(resultat));
    }

    public void calculFois(){
        String[] parts = textField.getText().split("\\*");
        String carac1 = parts[0];
        String carac2 = parts[1];
        double resultat1 = Integer.parseInt(carac1);
        double resultat2 = Integer.parseInt(carac2);
        double resultat = resultat1 * resultat2;
        textField.setText(String.valueOf(resultat));
    }
}
