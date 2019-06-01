package main.Java.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import main.Java.model.model1;

public class view1 {


    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public HBox p1;
    public VBox p2;
    public ImageView IV1;



    public view1(Stage primaryStage,model1 model) {


        p1 = new HBox();

        p1.setMinSize(1200,600);
        p1.setMaxSize(1200,600);

        p1.setBackground(new Background(new BackgroundFill(Color.web("#" + model.getColor()), CornerRadii.EMPTY, Insets.EMPTY)));
        p1.setMinSize(200,200);
        p1.setAlignment(Pos.CENTER);

        Button btn1 = new Button("Change Color!");
        btn2 = new Button("Change Size!");
        btn3 = new Button("Rotate Image!");
        btn4 = new Button("Imitate a dialog!");

         IV1 = new ImageView();
        IV1.setX(0);
        IV1.setY(0);
        IV1.setImage(new Image("/img/test.png"));



        p2 = new VBox();
        p2.setBackground(new Background(new BackgroundFill(Color.web("#05" + model.getColor()), CornerRadii.EMPTY, Insets.EMPTY)));

        p2.setAlignment(Pos.CENTER);
        p2.getChildren().add(btn1);
        p2.getChildren().add(btn2);
        p2.getChildren().add(IV1);
        p2.getChildren().add(btn3);
        p2.getChildren().add(btn4);

        p1.getChildren().add(p2);



        Scene scene = new Scene(p1, 1200,
                600);
        primaryStage.setTitle("Kausi Test");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
