package sample;
import java.lang.reflect.Array;
import java.net.URL;
import javafx.event.ActionEvent;
import java.util.*;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

//probaljuk meg először 2 számmal csak

public class Controller {
    ArrayList<String> elements = new ArrayList<String>();
    StringBuilder str = new StringBuilder();
    StringBuilder str2 = new StringBuilder();


    @FXML
    private Button nullButton;
    @FXML
    private Button oneButton;
    @FXML
    private Button twoButton;
    @FXML
    private Button threeButton;
    @FXML
    private Button fourButton;
    @FXML
    private Button fiveButton;
    @FXML
    private Button sixButton;
    @FXML
    private Button sevenButton;
    @FXML
    private Button eightButton;
    @FXML
    private Button nineButton;


    @FXML
    private Button subButton;
    @FXML
    private Button addButton;
    @FXML
    private Button divButton;
    @FXML
    private Button multiButton;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField calculationPanel;
    @FXML
    private TextField resultPanel;

    @FXML
    private Button resetButton;

    @FXML
    private Pane basePane;

    int num=0;
    int trigger=0;
    int numNull=0;
    String calculatorText="";

    @FXML
    private void resetButtonAction (ActionEvent event) {
        calculationPanel.setText( "You can type the numbers and choose the operation");
        resultPanel.setText(String.valueOf("Reset success"));
        str.delete(0,100);
        str2.delete(0,100);
        num=0;
    }

    @FXML
    private void nullButtonAction (ActionEvent event) {  //valami countert hozza lehetne adni, hogy ahányszor le lett nyomva, egy forcikulisban generaljon egy szamot, es ha a muveletet megadtuk akkor adjon csak hozza elemet az arrayhez
        if (num==0) {
            str.append("0");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("0");
            calculationPanel.setText(str2.toString());
        }

    }
    @FXML
    private void oneButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("1");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("1");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void twoButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("2");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("2");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void threeButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("3");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("3");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void fourButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("4");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("4");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void fiveButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("5");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("5");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void sixButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("6");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("6");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void sevenButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("7");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("7");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void eightButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("8");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("8");
            calculationPanel.setText(str2.toString());
        }
    }
    @FXML
    private void nineButtonAction (ActionEvent event) {
        if (num==0) {
            str.append("9");
            calculationPanel.setText(str.toString());
        }
        if (num==1 || num==2 || num==3 || num==4){
            str2.append("9");
            calculationPanel.setText(str2.toString());
        }
    }


    @FXML
    private void addButtonAction (ActionEvent event) {
        if (num==0) {
        String strX= str.toString();
        calculationPanel.setText(strX+"+");}
        num=1;

    }
    @FXML
    private void subButtonAction (ActionEvent event) {
        if (num==0) {
        String strX= str.toString();
        calculationPanel.setText(strX+"-");}
        num=2;

    }
    @FXML
    private void multiButtonAction (ActionEvent event) {
        if (num==0) {
        String strX= str.toString();
        calculationPanel.setText(strX+"*");}
        num=3;

    }
    @FXML
    private void divButtonAction (ActionEvent event) {  //itt valtoztatni
        if (num==0) {
        String strX= str.toString();
        calculationPanel.setText(strX+"/");}
        num=4;

    }


    @FXML
    private void calculateButtonAction (ActionEvent event) {
        try {
            if (num == 1) {
                calculationAdd();
            }
            if (num == 2) {
                calculationSub();
            }
            if (num == 3) {
                calculationMulti();
            }
            if (num == 4) {
                calculationDiv();
            }
        } catch (Exception e){
            resultPanel.setText("Something went wrong, please reset");
        }



    }

    private void calculationAdd(){
        int int1 = Integer.parseInt(str.toString());
        int int2 = Integer.parseInt(str2.toString());
        int sum= int1+int2;
        calculationPanel.setText("Calculating result");
        resultPanel.setText(String.valueOf(sum));
        num=5;
        pause();

    }

    private void calculationSub(){
        int int1 = Integer.parseInt(str.toString());
        int int2 = Integer.parseInt(str2.toString());
        int sub= int1-int2;
        calculationPanel.setText("Calculating result");

        resultPanel.setText(String.valueOf(sub));
        num=5;
        pause();

    }

    private void calculationMulti(){
        int int1 = Integer.parseInt(str.toString());
        int int2 = Integer.parseInt(str2.toString());
        int multi= int1*int2;
        calculationPanel.setText("Calculating result");
        resultPanel.setText(String.valueOf(multi));
        num=5;
        pause();

    }

    private void calculationDiv(){
        int int1 = Integer.parseInt(str.toString());
        int int2 = Integer.parseInt(str2.toString());
        double div= int1/int2;
        calculationPanel.setText("Calculating result");
        resultPanel.setText(String.valueOf(div));
        num=5;
        pause();

    }

    private void pause() {
        if(num==5){
            str.delete(0,100);
            str2.delete(0,100);
            num=0;
            try {
                Thread.sleep(50L);
            } catch(InterruptedException ie) {
                calculationPanel.setText("Error, please restart program");
                resultPanel.setText("Error, please restart program");
            }
        }
    }




}
