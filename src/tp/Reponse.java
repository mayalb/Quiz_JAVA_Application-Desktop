package tp;
public abstract class Reponse {
    private String reponse;
    private double k;
    public void repondreQuiz(Apprenant app){};
    public double evaluationQuiz(Quiz q,Apprenant apprenant){return k;};
    public void afficherRep(){};


}
