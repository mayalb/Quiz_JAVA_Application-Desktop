package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tp.Formation;
import tp.Quiz;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CreerFormationControlleur implements Initializable {
    @FXML
    private ListView mylisteView = new ListView();
    @FXML
    private TextField nom;
    @FXML
    private TextField des;
    @FXML
    private TextField dateO;
    @FXML
    private TextField dateF;

    public static ArrayList<Formation> ListFormation= new ArrayList<Formation>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public ArrayList<Formation> getListFormation() {
        return ListFormation;
    }

    public void terminer (ActionEvent event) throws IOException
    {
        Quiz quiz1= new Quiz();
        Quiz quiz2 = new Quiz();
        ArrayList<Quiz> ListQuiz= new ArrayList<Quiz>(); // creation de la liste des apprenants
        ListQuiz.add(quiz1);
        ListQuiz.add(quiz2);
/// ------------------------------------ gesttion de la formation et les apprenant ----------------------------------------///
        ArrayList<String >ReponseApprenant = new ArrayList<>();
        String name= nom.getText();
        String descrip=des.getText();
        String dO= dateO.getText();
        String dF= dateF.getText();
        Formation formation = new Formation(name, descrip, dO,dF,ListQuiz);

/// ----------------------------------------- creation de la formation ---------------------------------------------------///
         // creation de la liste des formations
        ListFormation.add(formation);
        Parent root = FXMLLoader.load(getClass().getResource("profil.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }
    public void Afficherformation (ActionEvent event) throws IOException
    {
        System.out.println("khraa");
        System.out.println("le nom"+ListFormation.get(0).getNom());
        ArrayList<String>li= new ArrayList<String>();
        for (int i=0 ; i<ListFormation.size();i++)
        {
            li.add("Le nom :"+ListFormation.get(i).getNom()+",Description :"+ListFormation.get(i).getDescription()+",Date d'ouverture :"+ListFormation.get(i).getDateOuverture()+",Date de fermeture :"+ListFormation.get(i).getDateFermeture());
        }
        for (String elem :li)
        {
            mylisteView.getItems().add(elem);
        }
    }
}
