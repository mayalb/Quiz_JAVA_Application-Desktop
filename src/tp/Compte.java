package tp;
import java.io.Serializable;
import java.util.HashMap;

public class Compte implements Serializable {
    private String login;
    private String mdp;
     private HashMap<Utilisateur,Compte> hashcompte = new HashMap<>() ;

    public  HashMap<Utilisateur, Compte> getHashcompte() {
        return hashcompte;
    }
    public Compte (){}
    public Compte(String login,String mdp){
        this.login=login ;
        this.mdp=mdp ;
    }
  /*  public Compte(String login , String mdp ,HashMap<Utilisateur, Compte> hashcompte) {
        this.hashcompte = hashcompte;
        this.login=login;
        this.mdp=mdp;
    }*/
  public void insererhashmap ( Utilisateur util,Compte compte){
      hashcompte.put(util,compte);

  }
    public Compte creercompte (Utilisateur util){
        String login= util.genererlogin(util.getNom(),util.getPrenom());
        String mdp= util.generermdp(util.getNom(),util.getDatenaissance());
        Compte compte =new Compte(login,mdp) ;


        return compte ;


    }
    public void afficherhashmap(){

        for (HashMap.Entry<Utilisateur, Compte> entry :  hashcompte.entrySet()) {
            System.out.println(entry.getValue().login);
            System.out.println(entry.getValue().mdp);
        }
    }

    public String getMdp() {
        return mdp;
    }

    public String getLogin() {
        return login;
    }

    public boolean authentification (String login,String mdp ){
         boolean aut=false ;


        for (HashMap.Entry<Utilisateur, Compte> entry :  hashcompte.entrySet()) {

            System.out.println(entry.getValue().login);
            System.out.println(entry.getValue().mdp);
            if((entry.getValue().login ==login) && (entry.getValue().mdp==mdp)){
                aut=true ;
            }
        }

        return aut;
         }

}
