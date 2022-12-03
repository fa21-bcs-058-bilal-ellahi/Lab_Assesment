package com.example.lab_assesment;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    static    int i = 0;

    static    int j = 0;
    static    int x = 0;

    static    int y = 0;


    @Override
    public void start(Stage stage) throws IOException {

        GridPane root = new GridPane();
        Scene scene = new Scene(root,600,500);

        root.setStyle("-fx-background-image: url(bk.jpeg); -fx-background-repeat: no-repeat; -fx-background-size: 600 500;   -fx-background-position: center center;");

        stage.setResizable(false);



        root.setAlignment(Pos.TOP_CENTER);
        root.setHgap(70);
        root.setVgap(40);
        root.setPadding(new Insets(70));

        Text text = new Text(1,1,"Click on Buttons to move the Object");
        text.setFont(Font.font(22));
        root.add(text,1,1,5,2);

        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");

        root.add(btn0,1,3);
        root.add(btn1,2,3);
        root.add(btn2,3,3);
        root.add(btn3,4,3);
        root.add(btn4,5,3);



        Button moving_btn = new Button("M");
        root.add(moving_btn,1,4);

        Button right_btn = new Button(">>");
        root.add(right_btn,3,8);

        Button left_btn = new Button("<<");
        root.add(left_btn,2,8);

        Button up_btn =new Button("^");
        root.add(up_btn,0,8);

        Button down_btn =new Button("D");
        root.add(down_btn,5,8);



        up_btn.setOnAction(u ->{
            if (up_btn.isPressed());
            x=y;
            y-=20;
            moving_btn.setTranslateY(y);

        });
        /*right_btn.setOnAction(r -> {
                });*/

        down_btn.setOnAction(d ->{
            if (down_btn.isPressed());
            y=x;
            x+=20;
            moving_btn.setTranslateY(x);
        });





       right_btn.setOnAction(r ->{
           if(i>390)
           {   j+= 30;
               moving_btn.setTranslateY(j);}
           else {
               i += 30;
               moving_btn.setTranslateX(i);
               java.awt.Toolkit.getDefaultToolkit().beep();
               System.out.println("\007");

               try {
                   Thread.sleep(10); // introduce delay
               } catch (InterruptedException e) {}

      /*     final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("beep.default");

           if (runnable != null) {
               runnable.run();
           }
*/          }});


        left_btn.setOnAction(r ->{

            if(i<0)
            {
                moving_btn.setTranslateY(j+= 10);
            }

            else
            {
            i-=30;
            moving_btn.setTranslateX(i);
            }

        });




        stage.setTitle("My Assessment");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}






/*
public class AudioPlayer extends Application {

    private static final AudioClip ALERT_AUDIOCLIP = new AudioClip(AudioPlayer.class.getResource("/alert.wav").toString());

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 300, 250);

        Button btn = new Button();
        btn.setText("Play (My Sound)");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                AudioPlayer.ALERT_AUDIOCLIP.play();
            }
        });

        Button btn2 = new Button();
        btn2.setText("Play (Windows Default)");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                final Runnable runnable = (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.default");

                if (runnable != null) {
                    runnable.run();
                }
            }
        });

        root.getChildren().add(btn);
        root.getChildren().add(btn2);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}*/
