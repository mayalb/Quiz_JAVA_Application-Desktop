package tp;
import java.util.*;
public class ReponseQCU extends Reponse {
    private String reponse ;

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public ReponseQCU(String reponse )
    {
        this.reponse=reponse;

    }
    public void repondreQuiz(Apprenant apprenant)
    {  ArrayList<String>rep = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Repoondre au qcu: Entrez la reponse unique  :");
        rep.add(sc.next());
        apprenant.setReponseApprenant(rep);
    }
    public double  evaluationQuiz(Quiz q,Apprenant apprenant)/// dans cette fonction on va comparer la liste ListeRepQcm qui contient les reponses de l'etudiant
    { /// avec le champa valeur de la map qui contient les reponses justes du quiz
        double eval=0;

            for (int i=0;i<apprenant.getReponseApprenant().size();i++)
            {
                System.out.println(apprenant.getReponseApprenant().get(i));
            }
            if ((apprenant.getReponseApprenant().contains(reponse)))

            {
                eval++;
            }

      return eval;
    }

}
