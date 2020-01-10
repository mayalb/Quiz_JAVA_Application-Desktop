package tp;
import java.util.*;

public class ReponseQO extends Reponse {
     private String reponse;

     public ReponseQO (String reponse) {
         this.reponse= reponse;

     }

    public String getReponse() {
        return reponse;
    }

    public void repondreQuiz(Apprenant apprenant)
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Repoondre au qo: Entrez la reponse de la question ouverte ");
        apprenant.getReponseApprenant().set(0,sc.next());


    }
    public double  evaluationQuiz(Quiz q,Apprenant apprenant)/// dans cette fonction on va comparer la liste ListeRepQcm qui contient les reponses de l'etudiant
    { /// avec le champa valeur de la map qui contient les reponses justes du quiz
        double eval=0;

        if (apprenant.getReponseApprenant().contains(reponse))

        {
            eval++;
        }

        return eval;
    }
}
