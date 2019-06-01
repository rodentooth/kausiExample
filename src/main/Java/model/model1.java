package main.Java.model;

import javafx.stage.Stage;

import java.util.Random;

public class model1 {



    public model1(){
    }



    public String getColor() {
        Random r = new Random();
        int i = 100000+r.nextInt(899999);
        System.out.println("The color is: "+i);
        return String.valueOf(i);
    }

    public double getWidth() {
        Random r = new Random();
        int i = 100+r.nextInt(800);
        System.out.println("The new SIZE is: "+i);
        return (i);
    }
}
