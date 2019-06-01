package main.Java.controller;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import main.Java.model.model1;
import main.Java.view.view1;

public class controller1 {

    public controller1(model1 model, view1 view) {

        /* Eine variante
        view.btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Clicked!");

            }

        });
*/
        view.btn1.setOnMouseClicked(event -> {


            view.p1.setBackground(new Background(new BackgroundFill(Color.web("#" + model.getColor()), CornerRadii.EMPTY, Insets.EMPTY)));
        });

        view.btn2.setOnMouseClicked(event -> {


            view.p2.setMinWidth(model.getWidth());
        });

        view.btn3.setOnMouseClicked(event -> {



            RotateTransition rotation = new RotateTransition(Duration.seconds(2), view.IV1);
            rotation.setCycleCount(2);
            rotation.setByAngle(360);

            view.IV1.setTranslateZ(view.IV1.getBoundsInLocal().getWidth() / 2.0);
            view.IV1.setRotationAxis(Rotate.Y_AXIS);
            rotation.play();
            view.IV1.setRotate(180);
        });


        view.btn4.setOnMouseClicked(event -> {


            TranslateTransition TT2 = new TranslateTransition(Duration.millis(800), view.IV1);

            TT2.setFromX(600);
            TT2.setFromY(00);

            TT2.setToX(0f);
            TT2.setToY(0);

            TT2.play();


            TranslateTransition TT = new TranslateTransition(Duration.millis(800), view.IV1);

            TT.setFromX(-600);
            TT.setFromY(00);

            TT.setToX(0f);
            TT.setToY(0);
            TT.play();


            FadeTransition ft2 = new FadeTransition(Duration.millis(300), view.IV1);
            ft2.setFromValue(1.0);
            ft2.setToValue(0.0);


            ft2.setOnFinished(e->{

                ft2.stop();

            });


            Thread dialog_thread = new Thread() {
                public void run() {
                    try {

                        int i =0;
                        while (i<1) {
                            Thread.sleep(1000);
                            i++;
                        }

                        Platform.runLater(ft2::play);


                        while (i<4) {
                            Thread.sleep(1000);
                            i++;
                        }

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {

                                view.IV1.setVisible(true);
                                view.IV1.setOpacity(1.0);

                            }
                        });


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };

            TT.setOnFinished(e ->{
                dialog_thread.start();

            });






        });



    }
    }
