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
// hadi fenetre te3 profil diri fiha wesh t7abi

public class ProfilController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
  /*  public void Comptes(ActionEvent event) throws IOException
    // hadi la fonction ki ycliqui 3la connexion fel bouton detlou onAction connxion yji yexecuti had l code
    {
        //((Node)event.getSource()).getScene().getWindow().hide(); // ykhabi la fenetre le9dima
        String mail= email.getText();
        String password= mdp.getText() ;
        Compte compte =new Compte ();
        boolean exist=false;
        exist=compte.authentification(mail,password) ;

        Parent root = FXMLLoader.load(getClass().getResource("profil.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    } */
  public void ajouterapp (ActionEvent event) throws IOException {


      Parent root = FXMLLoader.load(getClass().getResource("ajouapp.fxml")); // ychargili la page listeApprenant li ani haba nroh liha
      Stage primaryStage=new Stage();
      primaryStage.setTitle("ESI-QUIZZ ");
      primaryStage.setScene(new Scene(root, 700, 400));
      primaryStage.show();

  }
    public void afficherformations (ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("afficherformations.fxml")); // ychargili la page listeApprenant li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }
    public void quiz (ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("quiz.fxml")); // ychargili la page listeApprenant li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }
  public void MesApp (ActionEvent event) throws IOException {


      Parent root = FXMLLoader.load(getClass().getResource("ListeApprenant.fxml")); // ychargili la page listeApprenant li ani haba nroh liha
      Stage primaryStage=new Stage();
      primaryStage.setTitle("ESI-QUIZZ ");
      primaryStage.setScene(new Scene(root, 700, 400));
      primaryStage.show();

  }
  public void laFor(ActionEvent event)throws IOException
  {
      Parent root = FXMLLoader.load(getClass().getResource("CreerFormation.fxml")); // ychargili la page listeApprenant li ani haba nroh liha
      Stage primaryStage=new Stage();
      primaryStage.setTitle("ESI-QUIZZ ");
      primaryStage.setScene(new Scene(root, 700, 400));
      primaryStage.show();
  }
  public void Connexion (){}
  public void Inscription (){}
}
