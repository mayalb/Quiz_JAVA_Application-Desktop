package tp;
import java.util.ArrayList;
public class Notion {
    private String notion;
    private ArrayList<QCM>ListeQCM;
    private ArrayList<QCU>ListeQCU;
    private ArrayList<QO>ListeQO;
    private int nbQuestions;
    public Notion (){}

    public Notion (String notion,ArrayList<QCM>ListeQCM,ArrayList<QCU>ListeQCU,ArrayList<QO>ListeQO,int nbQuestions)
    {
        this.notion=notion;
        this.ListeQCM=ListeQCM;
        this.ListeQCU=ListeQCU;
        this.ListeQO=ListeQO;
        this.nbQuestions=nbQuestions;
    }

    public ArrayList<QO> getListeQO() {
        return ListeQO;
    }

    public ArrayList<QCU> getListeQCU() {
        return ListeQCU;
    }

    public ArrayList<QCM> getListeQCM() {
        return ListeQCM;
    }

    public void ajouterNotion(String notion){}

    public String getNotion() {
        return notion;
    }

    public void setListeQCM(ArrayList<QCM> listeQCM) {
        ListeQCM = listeQCM;
    }

    public void setListeQCU(ArrayList<QCU> listeQCU) {
        ListeQCU = listeQCU;
    }

    public void setListeQO(ArrayList<QO> listeQO) {
        ListeQO = listeQO;
    }

    public void supprimerNotion (String notion){}
    public void afficherNotion (){
        System.out.println(" la notion"+notion);
        Question q;
        for(int i=0;i<this.ListeQCM.size();i++)
        {
            q= this.ListeQCM.get(i);
            q.afficherQuestion() ;

        }
        for(int i=0;i<this.ListeQCU.size();i++)
        {
            q= this.ListeQCU.get(i);
            q.afficherQuestion() ;

        }
        QO qo;
        for(int i=0;i<this.ListeQO.size();i++)
        {
            qo= this.ListeQO.get(i);
            qo.afficherQuestion() ;

        }

    }
    public void  ajouterQuestion  (Question question){
        if((question.getClass()).equals(QCM.class) == true) {
            ListeQCM.add((QCM)question) ;
        }else{
            if((question.getClass()).equals(QCU.class) == true) {
                ListeQCU.add((QCU) question);
            }else{
                ListeQO.add((QO) question);
            }

        }

    }
    public void supprimerQuestion (Question question){
        if((question.getClass()).equals(QCM.class) == true) {
            ListeQCM.remove((QCM)question) ;
        }else{
            if((question.getClass()).equals(QCU.class) == true) {
                ListeQCU.remove((QCU) question);
            }else{
                ListeQO.remove((QO) question);
            }

        }
    }
    public void changerQuestion (Question question1 , Question question2  ){
        supprimerQuestion (question1);
        ajouterQuestion(question2) ;
    }


}
