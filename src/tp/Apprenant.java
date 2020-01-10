
package tp;
import java.util.*;

public class Apprenant extends Utilisateur {
    private String nom;
    private String prenom;
    private String adresse;
    private String dateDeNaissance;
    private ArrayList<String >ReponseApprenant ;


    public Apprenant(String nom, String prenom, String adresse, String dateDeNaissance,ArrayList<String >ReponseApprenant )
    {   this.nom = nom;
        this.prenom= prenom;
        this.adresse=adresse;
        this.dateDeNaissance=dateDeNaissance;
        this.ReponseApprenant=ReponseApprenant;
    }





    public ArrayList<String> getReponseApprenant() {
        return ReponseApprenant;
    }

    public void setReponseApprenant(ArrayList<String> reponseApprenant) {
        ReponseApprenant = reponseApprenant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void AfficherListeQuizOuvert(){}
    public void SelectionnerQUIZ (String nomQuiz) {}
}

