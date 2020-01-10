package tp;
import java.util.ArrayList;
import java.util.List;
public class Formateur extends Utilisateur {
    protected String nom;
    protected String prenom;
    protected String datenaissance;
    protected String adresse;
    private static ArrayList <Apprenant> ListeAp;
    private static ArrayList <Formation> ListeForm;

    public Formateur(String nom , String prenom,String datenaissance,String adresse,ArrayList<Apprenant> ap ,ArrayList <Formation> form ){
        super(nom,prenom,datenaissance,adresse);

        this.ListeAp= ap;
        this.ListeForm=form;

    }

        public void printListApp(ArrayList <Apprenant> ListeAp){

            for(Apprenant elem : ListeAp){
                System.out.println(" le nom de l'apprenant:");
                System.out.println(elem.getNom()+"  ");
                System.out.println(" le prenom de l'apprenant:");
                System.out.println(elem.getPrenom()+"  ");
                System.out.println(" la date de naissance ");
                System.out.println(elem.getDateDeNaissance()+"  ");
                System.out.println(" l'adresse:");
                System.out.println(elem.getAdresse()+"  ");
            }
        }
    public void printListForm(ArrayList<Formation> list){
        for(Formation elem : list){
            System.out.println(" le nom de la formation:");
            System.out.println(elem.getNom()+"  ");
        }
    }

    //
    public void creerCompte (String nom , String prenom , String dateNaissance, String adresse ){}
    public void SupprimerrCompte (String nom , String prenom , String dateNaissance, String adresse ){}

    public String getNom() {
        return super.getNom();
    }

    public String getPrenom() {
        return super.getPrenom();
    }

    public List<Apprenant> getListeAp() {
        return ListeAp;
    }

    public List<Formation> getListeForm() {
        return ListeForm;
    }
    public void ajouterApprenant(Apprenant apprenant)
    {


            if (!this.ListeAp.contains(apprenant)) {

                this.ListeAp.add(apprenant);

            }

    }


    public void supprimerApprenant ( Apprenant apprenant)
    {
        if (ListeAp != null) {
            if (this.ListeAp.contains(apprenant)) {

                this.ListeAp.remove(apprenant);

            }
        }
    }
    public  void miseAjourApprenant(Apprenant a, Apprenant b)
    {
        supprimerApprenant(a);
        ajouterApprenant(b);
    }
}
