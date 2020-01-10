package tp;
public class QO extends Question {
    private String question;
    private String reponse;


    public QO(String question, String reponse) {
        this.question=question;
        this.reponse=reponse ;
    }

    public String getReponse() {
        return reponse;
    }

    public QO(String question) {
        this.question=question;
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

    public String getQuestion() {
        return question;
    }

    void afficherQuestion() {
        System.out.println("lE TYPE est QO");
        System.out.println("la question :" + question);


    }
}
