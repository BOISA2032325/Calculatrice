package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import java.lang.reflect.InvocationTargetException;
import java.nio.Buffer;
import java.util.EmptyStackException;
import java.util.Stack;

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
    @FXML
    private Double reponse;



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
        textField.setText(chiffre+"^");
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

    public void calculDiviser(){
        String[] parts = textField.getText().split("/");
        String carac1 = parts[0];
        String carac2 = parts[1];
        double resultat1 = Integer.parseInt(carac1);
        double resultat2 = Integer.parseInt(carac2);
        double resultat = resultat1/resultat2;
        textField.setText(String.valueOf(resultat));
    }

    public void calculCarre(){
        String[] parts = textField.getText().split("\\^");
        String carac1 = parts[0];
        double resultat1 = Integer.parseInt(carac1);
        double resultat = Math.pow(resultat1,2);
        textField.setText(String.valueOf(resultat));
    }

    public void calculRacine(){
        String[] parts = textField.getText().split("√");
        String carac1 = parts[1];
        double resultat1 = Integer.parseInt(carac1);
        double resultat = Math.sqrt(resultat1);
        textField.setText(String.valueOf(resultat));
    }

    public void calculInverse(){
        String[] parts = textField.getText().split("1/");
        String carac1 = parts[1];
        double resultat1 = Integer.parseInt(carac1);
        double resultat = (1/resultat1);
        textField.setText(String.valueOf(resultat));
    }



    public void reponse(){
        //https://programmer.ink/think/using-stack-to-use-simple-calculator-java-implementation.html

        String express = textField.getText();
        int index = 0;
        double num1 = 0;
        double num2 = 0;
        double num = 0;
        double res = 0;
        char ch = ' ';
        int oper = 0;
        ArrayStack numStack = new ArrayStack(10);
        ArrayStack operStack = new ArrayStack(10);
        while (true){
            ch = express.substring(index,index+1).charAt(0);
            if (operStack.isOper(ch)){
                if(!operStack.isEmpty()){

                    try {
                        if(operStack.priority(ch)<=operStack.priority(operStack.peek())){
                            num1 = numStack.pop();
                            num2 = numStack.pop();
                            oper = operStack.pop();
                            res = operStack.cal2(num1,oper);
                            numStack.push((int) res);
                            operStack.push(ch);
                        }
                        else{
                            operStack.push(ch);
                        }
                    }
                    catch (EmptyStackException e){
                        if(operStack.priority(ch)<=operStack.priority(operStack.peek())){
                            num = numStack.pop();
                            oper = operStack.pop();
                            res = operStack.cal2(num,oper);
                            numStack.push((int) res);
                            operStack.push(ch);
                        }
                        else{
                            operStack.push(ch);
                        }
                        e.printStackTrace();
                    }
                }else{
                    operStack.push(ch);
                }
            }else {
                numStack.push(ch-48);
            }
            index++;
            if(index >= express.length()){
                break;
            }
        }
        while (true){
            if(operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = operStack.cal(num1,num2,oper);
            numStack.push((int) res);
        }
        textField.setText("= " + numStack.pop());
    }
}
