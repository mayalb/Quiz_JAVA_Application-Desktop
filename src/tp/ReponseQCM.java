package tp;
import java.util.*;

public class ReponseQCM extends  Reponse{
    private ArrayList <String> ListeRepQcm;

    public ArrayList<String> getListeRepQcm() {
        return ListeRepQcm;
    }

    public ReponseQCM (ArrayList <String> ListeRepQcm){
        this.ListeRepQcm= ListeRepQcm;
    }
    public void repondre (){

    }
    /// ------------------------------ RepondreQuiz ----------------------------------------------------------////
    public void repondreQuiz(Apprenant app)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Repoondre au qcm: Entrez le nombre de reponses que vous voulez inserer :");
        int nbRep = sc.nextInt();
        System.out.println("le nombre de reponses est: "+nbRep);
        for (int i=0;i<nbRep;i++)
        {
            Quiz q = new Quiz();
            System.out.println("Entrez la reponse numuro:"+i);
            Scanner scc = new Scanner(System.in);
            String str = scc.nextLine();
            System.out.println("votre  reponses est: "+str);
            app.getReponseApprenant().add(str);
        }
    }

    /// --------------------------- EvaluationQuiz-------------------------------------------------------------///
  public double evaluationQuiz(Quiz q,Apprenant apprenant )
  {
      double eval=0;
      if (q.getExercice()!=null) // la map
      {   ArrayList<String >Liste= new ArrayList<>();// de la map
          ReponseQCM rep = new ReponseQCM(Liste);// Reponse d etype QCM pour la map
          Object o;
              o=q.getExercice().values();// o est un objet
              for (int i=0;i<apprenant.getReponseApprenant().size();i++)// la liste des reponses de l'utilisateur
              {
                  if (ListeRepQcm.contains(apprenant.getReponseApprenant().get(i)))
                  {
                      eval++;
                  }
              }
      }
      return eval;
  }
  ///---------------------------------Affichage des Reponses ---------------------------------------------///
  public void afficherRep(){
      for ( int i=0;i<this.ListeRepQcm.size();i++) {
          System.out.println(ListeRepQcm.get(i));
      }
  }
}

