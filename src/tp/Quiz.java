package tp;
import java.util.*;
public class Quiz {
    private String nom;
    private String dateOuverture ;
    private String dateExpiration ;
    private static int nbquestion ;
    private Map<Question,Reponse> exercice;


    public Map<Question, Reponse> getExercice() {
        return exercice;
    }

    int NbNotions ;
    ArrayList<Notion> listeNotions ;
     public Quiz (){}
     public Quiz ( String nom ,String dateOuverture,String dateExpiration,int NbNotions,ArrayList<Notion> listeNotions){
         this.nom=nom;
         this.dateOuverture=dateOuverture;
         this.dateExpiration=dateExpiration;
         this.NbNotions=NbNotions;
         this.listeNotions=listeNotions;

     }

    public void setListeNotions(ArrayList<Notion> listeNotions) {
        this.listeNotions = listeNotions;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public String getNom() {
        return nom;
    }

    public Quiz (String nom , String dateOuverture, String dateExpiration, int NbNotions, ArrayList<Notion> listeNotions, Map<Question,Reponse> exercice){
        this.nom=nom;
        this.dateOuverture=dateOuverture;
        this.dateExpiration=dateExpiration;
        this.NbNotions=NbNotions;
        this.listeNotions=listeNotions;
        this.exercice= exercice;
    }


    public void genererQuiz ( String nom,  String dateOuverture, String dateExpiration ,int Nbnotion ,Set <Notion> listenotions){}
    public void fermerQuiz(String quiz){}


///----------------------------- visualisation du quiz ---------------------------------------///
    public void visualiserQuiz(){
    System.out.println(" Quiz:"+nom);
    System.out.println(" Date d'ouverture:"+dateOuverture);
    System.out.println(" Date d'expiration:"+dateExpiration);
    System.out.println(" la liste des notions:");
        Notion n;
        for(int i=0;i<this.listeNotions.size();i++)
        {
            n= this.listeNotions.get(i);
            n.afficherNotion();

        }
    System.out.println(" le nombre de questions:"+exercice.size());

        for(Map.Entry<Question, Reponse> entry: exercice.entrySet()) {
            System.out.println(" la question:");
            entry.getKey().afficherQuestion();
        }

    }

    public void modifierTitre(String quiz , String titre){}
    public void modifierDate(String quiz , String dateouv){}
    public void modifierDateFerm(String quiz , String dateferm){}
    public void sauvgarderQuiz(String quiz){}
    public void afficherDateOuv(){}
    public void afficherDateFerm(){}
    public void afficherReponses(Quiz quiz){}
    /// ------------------------ Affichage du taux d'accomplissement -------------------------------------///

    public void AfficherTauxDacomplissement(Quiz q,Apprenant apprenant)
    {
        double note=0;
        for (Map.Entry<Question, Reponse> entry : exercice.entrySet()) {
            note =note +entry.getValue().evaluationQuiz(q,apprenant);
            System.out.println(" la note est ");
            System.out.println(entry.getValue().evaluationQuiz(q,apprenant));
        }
        System.out.println(" le taux d'accomplissement est:"+note);
    }
    ///--------------------------- Repondre au quiz -----------------------------------------------------///
    public void repondreQuiz(Apprenant apprenant)
    {  for(Map.Entry<Question, Reponse> entry: exercice.entrySet()) {
         entry.getValue().repondreQuiz(apprenant);
    }




} }
