package tp;
public class Utilisateur {
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String adresse ;


    public Utilisateur () {}
    public Utilisateur(String nom,String prenom,String datenaissance , String adresse) {
        this.nom = nom;
        this.prenom=prenom;
        this.dateDeNaissance=datenaissance;
        this.adresse=adresse;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getNom() {

        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public String genererlogin(String nom , String prenom){
        String login ;
        char lettre = prenom.charAt(0);
        login =lettre+nom;
        return login ;
    }
    public String generermdp(String nom , String datenaissance){
        String mdp ;
        mdp =nom+datenaissance;
        return mdp ;
    }

    public String getDatenaissance() {
        return dateDeNaissance;
    }
}
