package tp;
import java.util.*;
public class Formation {
    private String nom;
    private String description;
    private String dateOuverture;
    private String dateFermeture;
    private ArrayList <Quiz> ListeQuiz;


    public String getNom() {
        return nom;

    }

    public String getDescription() {
        return description;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public String getDateFermeture() {
        return dateFermeture;
    }

    public Formation (String nom, String description, String  dateOuverture, String  dateFermeture, ArrayList listeQuiz){
        this.nom=nom;
        this.description=description;
        this.dateOuverture=dateOuverture;
        this.dateFermeture=dateFermeture;
        this.ListeQuiz=ListeQuiz;
    }
    public void addQuiz (Quiz quiz) {
        ListeQuiz.add(quiz);
    }
    public void ajouterFormation(String formation) {}// creation rt ajout d'une formation
    public void supprimerFormation(String formation){}
    public void ajouterQuizDeList( String nom ){};
    public void supprimerQuizDeListe(String nom ){};
}
