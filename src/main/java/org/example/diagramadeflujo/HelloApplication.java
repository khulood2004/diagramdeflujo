package org.example.diagramadeflujo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    String array[] = {"z","b","e","f","a","c","o"};
    int temp =0;
    for (int i =1; i<=6; i++){
        for (int j =i+1; i<=7; i++){
        if (array[1]>array [2]){
                temp=array[1];
                array [1]=array [2];
                array [2]=temp;
                System.out.println("array[1]");
            }

                        }

    }
}