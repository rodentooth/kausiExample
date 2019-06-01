package main;

import javafx.application.Application;
import javafx.stage.Stage;
import main.Java.controller.controller1;
import main.Java.model.model1;
import main.Java.view.view1;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        model1 model = new model1();
        view1 view = new view1(primaryStage,model);
        controller1 cntr = new controller1(model,view);





    }


    public static void main(String[] args) {
        launch(args);
    }
}
