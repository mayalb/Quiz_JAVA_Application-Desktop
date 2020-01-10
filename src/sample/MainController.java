package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tp.Compte;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Serializable {
    // zoubida hnaya t7ati les id te3k li aki haba trécupirihoml kima ana dertlk id tem email houwa email w te3 password mdp
    // id tdirih f scene builder f code tel9ak fx:id
    @FXML
    private Label lblstatus;
    @FXML
    private TextField email;
    @FXML
    private TextField mdp;
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {


    }
    public void connexion(ActionEvent event) throws IOException
    // hadi la fonction ki ycliqui 3la connexion fel bouton detlou onAction connxion yji yexecuti had l code
    {
        //((Node)event.getSource()).getScene().getWindow().hide(); // ykhabi la fenetre le9dima
       String mail= email.getText();
       String password= mdp.getText() ;
        Compte compte1 = new Compte (mail,password);
        try {
            FileInputStream fis = new FileInputStream("comptes.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            compte1 = (Compte) ois.readObject(); // 4
            System.out.println(" le login est:"+compte1.getLogin());
            System.out.println(" le mdp est:"+compte1.getMdp());
            //in=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("comptes.txt"))));

            if ((email.getText().equals(compte1.getLogin())&&(mdp.getText().equals(compte1.getMdp()))))
            {
                boolean c=true;
                lblstatus.setText(" Successed ");
                Parent root = FXMLLoader.load(getClass().getResource("profil.fxml")); // ychargili la page profil li ani haba nroh liha
                Stage primaryStage=new Stage();
                primaryStage.setTitle("ESI-QUIZZ ");
                primaryStage.setScene(new Scene(root, 700, 400));
                primaryStage.show();
            }
            else
            {
                lblstatus.setText(" Failed ");
            }


            fis.close();

            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /////////////////////le teste///////////////////////////////////////////////////


        //////////////////////////////////////////////////////////////////////////








    }


    public void inscrire(ActionEvent event) throws IOException

    {



        Parent root = FXMLLoader.load(getClass().getResource("Inscription .fxml")); // ychargili la page profil li ani haba nroh liha
         Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }
}
