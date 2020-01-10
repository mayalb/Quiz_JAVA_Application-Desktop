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
import tp.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListeApprenantController implements Initializable {
    @FXML
    private ListView mlisteView = new ListView();
    @FXML
    private TextField Nom;
    @FXML
    private TextField Prénom;
    @FXML
    private TextField Adresse;
    @FXML
    private TextField Datenaissance;
    public static ArrayList<Apprenant> ListApprenant= new ArrayList<Apprenant>();

    @Override


    public void initialize(URL location, ResourceBundle resources) {
    }



    public void Affichage (ActionEvent event) throws IOException {
        CreerFormationControlleur c = new CreerFormationControlleur();
        ArrayList<String >ReponseApprenant = new ArrayList<>();

/// ------------------- Affichage du formateur et la liste des apprenants et la liste des formations -------------------------////
        Apprenant apprenant1 = new Apprenant(" gasmi", "zeyneb", "Boumerdes", "4/6/1999",ReponseApprenant);
        Apprenant apprenant2 = new Apprenant(" gasmi", " adel", "Tunisie", "12/12/2013",ReponseApprenant);
        Apprenant apprenant3 = new Apprenant(" flissi", " ghada", " Medea", "17/05/1996",ReponseApprenant);
        Apprenant apprenant4 = new Apprenant(" gasmi", "islem", "Bouira", "2/6/1999",ReponseApprenant);

///------------------------------------------creation de la liste des apprenants------------------------------------------///

        // creation de la liste des apprenants
        ListApprenant.add(apprenant1);
        ListApprenant.add(apprenant4);
        ListApprenant.add(apprenant2);
        ListApprenant.add(apprenant3);
        System.out.println(ListApprenant.get(0).getNom());
        ArrayList<String>li= new ArrayList<String>();
        for (int i=0 ; i<ListApprenant.size();i++)
        {
            li.add(ListApprenant.get(i).getNom()+","+ListApprenant.get(i).getPrenom()+","+ListApprenant.get(i).getDateDeNaissance());
        }
        for (String elem :li)
        {
            mlisteView.getItems().add(elem);
        }
        String nom="larbi";
        String prenom="maya" ;
        String datenaissance="17/09/1999";
        String adresse ="bouira";

         Formateur formateur = new Formateur(nom,prenom,datenaissance,adresse,ListApprenant,c.getListFormation());

        System.out.println(" la liste des apprenants:");



    }
    public void nouvApp(ActionEvent event) throws IOException {

        String nom= Nom.getText();
        String prenom= Prénom.getText() ;
        String adr= Adresse.getText() ;
        String datenaiss= Datenaissance.getText() ;
        System.out.println(" le nom est :"+nom+" Le prenom est :"+prenom);
        // Utilisateur utilisateur = new Utilisateur (prenom,Nom,datenaiss,adr);
        ArrayList<String >ReponseApprenant = new ArrayList<>();

        Apprenant utilisateur = new Apprenant(nom,prenom,adr,datenaiss,ReponseApprenant);
        ListApprenant.add(utilisateur);
//        System.out.println("le formateur est "+format.getNom());

        Compte compte =new Compte ();
        compte= compte.creercompte(utilisateur);

        String h=compte.getLogin();
        String hh=compte.getMdp();
        System.out.println("compte créé, le login est "+h+"le mdp est "+hh);
        compte.insererhashmap(utilisateur,compte);


        Parent root = FXMLLoader.load(getClass().getResource("profil.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }


}
