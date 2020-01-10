package sample;
import tp.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;

import java.io.*;
import java.util.ArrayList;
import java.net.URL;
import java.util.ResourceBundle;

public class InscriptionController implements Initializable , Serializable {
    @FXML
    private TextField Nom;
    @FXML
    private TextField Prénom;
    @FXML
    private TextField Adresse;
    @FXML
    private TextField Datenaissance;
    static ArrayList<Apprenant> ListApprenant= new ArrayList<Apprenant>();

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {


    }
    public void inscription(ActionEvent event) throws IOException, ClassNotFoundException {

        String nom= Nom.getText();
        String prenom= Prénom.getText() ;
        String adr= Adresse.getText() ;
        String datenaiss= Datenaissance.getText() ;
        System.out.println(" le nom est :"+nom+" Le prenom est :"+prenom);
       // Utilisateur utilisateur = new Utilisateur (prenom,Nom,datenaiss,adr);
        ArrayList<Apprenant> ListApprenant= new ArrayList<Apprenant>();
        ArrayList<Formation> ListFormation= new ArrayList<Formation>();

        Formateur  utilisateur = new Formateur(nom,prenom,datenaiss,adr,ListApprenant, ListFormation);

        Compte compte =new Compte ();
        compte= compte.creercompte(utilisateur);

        String h=compte.getLogin();
        String hh=compte.getMdp();
        Compte compte1= new Compte(h,hh);
        try {
            FileOutputStream fs = new FileOutputStream("comptes.txt");
            try (ObjectOutputStream os = new ObjectOutputStream(fs)) {
                os.writeObject(compte1); // 3
                os.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }





        System.out.println("compte créé, le login est "+h+"le mdp est "+hh);
        compte.insererhashmap(utilisateur,compte);

        //------serialisation --------------


//


//
        Parent root = FXMLLoader.load(getClass().getResource("profil.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }

}
