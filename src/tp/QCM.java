package tp;
import java.util.ArrayList;
public class QCM extends Question {
    private String question;
    private ArrayList <Proposition> PropositionQCM;

    public QCM(){}
    public QCM (String question, ArrayList <Proposition> PropositionQCM){
        this.question=question;
        this.PropositionQCM= PropositionQCM;

    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Proposition> getPropositionQCM() {
        return PropositionQCM;
    }

    public int evaluation (String question, int evaluation){return evaluation; }
    void ajouterQuestion (String question, String type){}//red
    void supprimerQuestion (String question, String type){}//red
    void changerQuestion (String question1 , String question2 , String type ){}//red

    void afficherQuestion (){
        System.out.println("lE TYPE est QCM");
        System.out.println("la question :"+question);
        if ( PropositionQCM!= null) {
            for ( int i=0;i<this.PropositionQCM.size();i++) {
                System.out.println(PropositionQCM.get(i).getProposition());
            }
        }

    }

}
