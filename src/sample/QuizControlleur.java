package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class QuizControlleur implements Initializable {
    public void initialize(URL location, ResourceBundle resources)
    {


    }
    public void ajounotion(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("Notion.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }
//************************************************************************************************//
public void afficherListeNotions(ActionEvent event) throws IOException {
    // String not = notion.getText();
    Parent root = FXMLLoader.load(getClass().getResource("mesNotion.fxml")); // ychargili la page profil li ani haba nroh liha
    Stage primaryStage=new Stage();
    primaryStage.setTitle("ESI-QUIZZ ");
    primaryStage.setScene(new Scene(root, 700, 400));
    primaryStage.show();
}














    public void ajounquestion(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("profil.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }
    public void affquiz(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("infoQuiz.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }
    public void afficherlistquiz(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("afficherTableNotion.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }

}
