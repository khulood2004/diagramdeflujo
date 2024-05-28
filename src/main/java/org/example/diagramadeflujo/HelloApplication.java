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
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int acum1 = 0;
    int acum2=1;
    int acum3=0;
    for (int i =1; i<=number; i++){
        System.out.print("acum1:");
        acum3=acum1+acum2;
        acum1=acum2;
        acum2=acum3;
        System.out.println(acum1);

                        }

    }
}