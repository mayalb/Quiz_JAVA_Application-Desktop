package tp;
import java.util.*;
public class QCU extends Question {
    private String question;
    private ArrayList<Proposition> PropositionQCU;

    public String getQuestion() {
        return question;
    }

    public QCU(String question, ArrayList<Proposition> PropositionQCU) {
        this.question=question;
        this.PropositionQCU= PropositionQCU;
    }

    public int evaluation(String question, int evaluation) {
        return evaluation;
    }

    void ajouterQuestion(String question, String type) {
    } //red

    void supprimerQuestion(String question, String type) {
    } //red

    void changerQuestion(String question1, String question2, String type) {
    } //red


    public ArrayList<Proposition> getPropositionQCU() {
        return PropositionQCU;
    }

    void afficherQuestion (){
        System.out.println("lE TYPE est QCU");
        System.out.println("la question :"+question);
        if ( PropositionQCU!= null) {
            for ( int i=0;i<this.PropositionQCU.size();i++) {
                System.out.println(PropositionQCU.get(i).getProposition());
            }
        }

    }
}

