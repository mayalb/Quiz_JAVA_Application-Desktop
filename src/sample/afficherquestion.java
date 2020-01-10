package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class afficherquestion extends Application {
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Test Question 1");

        Label labelfirst= new Label("What is 10 + 20?");
        Label labelresponse= new Label();


        Button button= new Button("Submit");

        RadioButton radio1, radio2, radio3, radio4;
        radio1=new RadioButton("10");
        radio2= new RadioButton("20");
        radio3= new RadioButton("30");
        radio4= new RadioButton("40");


        button.setDisable(true);

        radio1.setOnAction(e -> button.setDisable(false) );
        radio2.setOnAction(e -> button.setDisable(false) );
        radio3.setOnAction(e -> button.setDisable(false) );
        radio4.setOnAction(e -> button.setDisable(false) );
        VBox layout= new VBox(5);

        layout.getChildren().addAll(labelfirst, radio1, radio2, radio3, radio4, button, labelresponse);

        Scene scene1= new Scene(layout, 400, 250);
        primaryStage.setScene(scene1);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

