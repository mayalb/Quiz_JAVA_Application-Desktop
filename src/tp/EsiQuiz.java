package tp;
import java.util.*;
public class EsiQuiz {

    public static void main(String args[]) {

        Quiz quiz1= new Quiz();
        Quiz quiz2 = new Quiz();
        ArrayList<Quiz> ListQuiz= new ArrayList<Quiz>(); // creation de la liste des apprenants
        ListQuiz.add(quiz1);
        ListQuiz.add(quiz2);
/// ------------------------------------ gesttion de la formation et les apprenant ----------------------------------------///
        ArrayList<String >ReponseApprenant = new ArrayList<>();
        Formation formation = new Formation("mobile", "apprendre a devlopper ....", "21/12/2013", "12/01/2014",ListQuiz);
        Apprenant apprenant1 = new Apprenant(" gasmi", "zeyneb", "Boumerdes", "4/6/1999",ReponseApprenant);
        Apprenant apprenant2 = new Apprenant(" gasmi", " adel", "Tunisie", "12/12/2013",ReponseApprenant);
        Apprenant apprenant3 = new Apprenant(" flissi", " ghada", " Medea", "17/05/1996",ReponseApprenant);
        Apprenant apprenant4 = new Apprenant(" gasmi", "islem", "Bouira", "2/6/1999",ReponseApprenant);

///------------------------------------------creation de la liste des apprenants------------------------------------------///

        ArrayList<Apprenant> ListApprenant= new ArrayList<Apprenant>(); // creation de la liste des apprenants
        ListApprenant.add(apprenant1);
        ListApprenant.add(apprenant2);
        ListApprenant.add(apprenant3);
/// ----------------------------------------- creation de la formation ---------------------------------------------------///
        ArrayList<Formation> ListFormation= new ArrayList<Formation>(); // creation de la liste des formations
        ListFormation.add(formation);
System.out.println(" ------------------- Affichage du formateur et la liste des apprenants et la liste des formations -------------------------////");
        String nom="Larbi";
        String prenom="Maya" ;
        String datenaissance="17/09/1999";
        String adresse ="Bouira";
        Utilisateur utilisateur =new Utilisateur (nom,prenom,datenaissance,adresse) ;
        Formateur formateur = new Formateur(nom,prenom,datenaissance,adresse,ListApprenant, ListFormation);
        System.out.println(" affichage du formateur: ");
        System.out.println(" le nom:"+formateur.getNom());
        System.out.println(" le prenom:"+formateur.getPrenom());
        System.out.println(" la liste des apprenants:");
        formateur.printListApp(ListApprenant);
        System.out.println("--------------------------- la liste des formations : --------------------------------------");

/// ------------------ teste des methodes ajouter et supprimer et mise a jour apprenant -----------------------------------------////
        formateur.printListForm(ListFormation);
        formateur.ajouterApprenant(apprenant4);
        formateur.supprimerApprenant(apprenant4);
        formateur.miseAjourApprenant(apprenant1,apprenant2);
        System.out.println(" la liste des apprenants:");
        formateur.printListApp(ListApprenant);

///---------------------- cretation des liste de propositin et de questions et la cretaion d'un quiz -----------------------------------///
        Proposition proposition1= new Proposition("le ciel est bleu");
        Proposition proposition2= new Proposition("le soleil est rose");
        Proposition proposition3= new Proposition("le soleil est jaune");

        ArrayList<Proposition>ListeProp1= new ArrayList<>();
        ListeProp1.add(proposition1);
        ListeProp1.add(proposition2);
        ListeProp1.add(proposition3);


        Proposition proposition5= new Proposition("le pays le plus developpee est l'amerique");
        Proposition proposition4= new Proposition("le pays le plus developpee est l'algerie");
        ArrayList<Proposition>ListeProp2= new ArrayList<>();
        ListeProp2.add(proposition5);
        ListeProp2.add(proposition4);
        QCM qcm = new QCM ("choisissez la/les bonne reponse !",ListeProp1);
       // QCM qcm1 = new QCM ("ne cochez pas la/les bonne reponse !",ListeProp1);
        QCU qcu =  new QCU (" choisissez une seule bonne reponse: ",ListeProp2);
        QO qo= new QO(" Quelle est le nombre des wilayas d'Algerie  ? ");
        ArrayList<QCM> ListQCM = new ArrayList<>();
        ListQCM.add(qcm);
        ArrayList<QCU> ListQCU = new ArrayList<>();
        ArrayList<QO> ListQO = new ArrayList<>();
        ListQCU.add(qcu);
        ListQO.add(qo);

/// ---------------------- creation des notions ----------------------------------------------------------------////

        Notion notion = new Notion (" notion1 ",ListQCM,ListQCU,ListQO,3 );
        ArrayList<Notion>ListNotion= new ArrayList<>();
        ListNotion.add(notion);
        Quiz quiz = new Quiz ("quizTest","12/12/2017","13/10/1018",1,ListNotion);
       // notion.ajouterQuestion(qcm1);
/// ------------------------ Visualisation d'un quiz --------------------------------------------------------////
       ArrayList <String> rep = new ArrayList<>();
       rep.add("le ciel est bleu");
       rep.add("le soleil est jaune");

       // ----------------traitement d'une question du type QCM ---------------------------------------------////
        ReponseQCM repQcm = new ReponseQCM(rep);
        Map<Question,Reponse> mapExo= new HashMap<Question,Reponse>();
        mapExo.put(qcm,repQcm);/// remplir la map avec les questions et les reponses///////
        ///----------------- traitement d'une question du type QCU -----------------------------------------////
        String repqcu="le pays le plus developpee est l'amerique";
        ReponseQCU repQcu = new ReponseQCU(repqcu);
        mapExo.put(qcu,repQcu);
        /// ------------------ traitement d'une question dy tupe QO---------------------------------------------///
        String repqo="48";
        ReponseQO repQo = new ReponseQO(repqo);
        mapExo.put(qo,repQo);
        ///------------------ affichage du quiz , repondre et affichage du taux d'accomplissement-----------------///
        Quiz quiz3 = new Quiz ("quizTest2","12/12/2017","13/10/1018",1,ListNotion,mapExo);
        System.out.println("----------------------- Visualisation du quiz ------------------------------------");
        quiz3.visualiserQuiz();
        System.out.println("----------------------- Repondre aux quiz----------------------------------");
        quiz3.repondreQuiz(apprenant1);
        quiz3.AfficherTauxDacomplissement(quiz3,apprenant1);





      // -------------------------créer un compte-------------------------------//
        System.out.println("Entrez votre nom  :");
        Scanner sc = new Scanner(System.in);
        String firstname ;
        firstname=sc.next();
        System.out.println("Entrez votre prenom :");
        Scanner sm = new Scanner(System.in);
        String lastname;
       lastname=sm.next();
        System.out.println("Entrez votre date de naissance :");
        Scanner sn = new Scanner(System.in);
        String date;
        date=sn.next();
        System.out.println("Entrez votre adresse :");
        Scanner sa = new Scanner(System.in);
        String adressse;
        adressse=sa.next();


        Utilisateur utilisateur2 =new Utilisateur (firstname,lastname,date,adressse);
        Compte compte =new Compte ();
        boolean exist=false;
      //  Compte compt=new Compte();
       compte= compte.creercompte(utilisateur2);
        String h=compte.getLogin();
        String hh=compte.getMdp();
        System.out.println("compte créé, le login est "+h+"le mdp est "+hh);
        compte.insererhashmap(utilisateur2,compte);
        compte.afficherhashmap();
        exist=compte.authentification(h,hh) ;
        if(exist){
            System.out.println("votre compte existe");
        }


        }
    }