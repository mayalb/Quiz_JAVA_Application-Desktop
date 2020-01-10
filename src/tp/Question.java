package tp;
import java.util.ArrayList;
import java.util.*;
public abstract class Question {
    private String question;
    private String type ;
    private ArrayList<Proposition> ListeProp;
    public Question(){}
    public Question(String type, String question, ArrayList<Proposition> listeProp) {
        this.type=type;
        this.question = question;
        this.ListeProp = listeProp;
    }
    public void ajouterPropposition(Question question , Proposition proposition ){
        int i=0;
        boolean trouv = false;
        while ( i<question.ListeProp.size() )
        {
            if( question.ListeProp.get(i)!= proposition)
            {

                 i++;

            }
            else trouv = true;
        }  if (trouv = false)
        question.ListeProp.set( question.ListeProp.size()+1,proposition);

    }



    void afficherLesPropositions (String Question) {}

    void afficherQuestion (){

    }


}

