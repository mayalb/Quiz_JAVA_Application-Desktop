package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tp.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class NotionController implements Initializable {
    @FXML
    private TextField notion;
    @FXML
    private TextField propjuste1;
    @FXML
    private TextField propjuste2;
    @FXML
    private TextField propfausse1;
    @FXML
    private TextField propfausse2;
    @FXML
    private TextField question;
    @FXML
    private TextField question2;
    @FXML
    private TextField question3;
    @FXML
    private TextField tittreQuiz;
    @FXML
    private TextField dateOuverture;
    @FXML
    private TextField dateExpiration;
    @FXML
    private TextField nbNotions;
    @FXML
    private ListView listeView1 = new ListView();
    @FXML
    private ListView listeView2 = new ListView();
    @FXML
    private TextField propof3;
    @FXML
    private TextField propov1;
    @FXML
    private TextField propof1;
    @FXML
    private TextField propof2;
    @FXML
    private TextField repqo;
    @FXML
    private TextField nomquiz;


    public static ArrayList<Quiz>ListeQuiz = new ArrayList<Quiz>();
    public static ArrayList<QCM>ListQCM= new ArrayList<>();
    public static ArrayList<QCU>ListQCU= new ArrayList<>();
    public static ArrayList<QO>ListQO= new ArrayList<>();
    public static ArrayList<Notion>ListNotion= new ArrayList<>();
    public static Notion objetnotion;
    @FXML private TableView<Notion> table;
    @FXML private TableColumn<Notion, String> NomNotionColumn;

    @Override

    public void initialize(URL location, ResourceBundle resources)
    {


    }
    public void ajounqcm(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("QCM.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();





    }
    public void ajounotion(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("Quiz.fxml")); // ychargili la page profil li ani haba nroh liha
        Button btn = new Button(notion.getText());

        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();





    }
    public void ajounqcu(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("QCU.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }
    public void ajounqo(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("QO.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }
    public void ajouternotion (ActionEvent event ) throws IOException
    {   String nomQuiz=nomquiz.getText();
        String nomNot = notion.getText();
        for(int i=0;i<ListeQuiz.size();i++){
            System.out.println("ani nparcouri f listquiz , nom li dakhlo l util  " +nomQuiz);
            System.out.println("ani nparcouri f listquiz , nom t3 had l quiz   " +ListeQuiz.get(i).getNom());
            if(nomQuiz.equals(ListeQuiz.get(i).getNom())){
                System.out.println("ani dkhalt l ifffffffffffffff");
                ArrayList <QCM>Lqcm = new ArrayList<>();
                ArrayList <QCU>Lqcu = new ArrayList<>();
                ArrayList <QO>Lqo = new ArrayList<>();
                int nbqs=0;
                Notion nouvNot = new Notion(nomNot,Lqcm,Lqcu,Lqo,nbqs);
                ListNotion.add(nouvNot);
                ListeQuiz.get(i).setListeNotions(ListNotion);

            }
        }


    }


 /*   public void afficherQuiz()
    {
        final Label label = new Label("Selected: ");


        final ListView<String> listView = new ListView<>();
        ObservableList<String> list = FXCollections.observableArrayList ();

        for(int i=0;i<ListeQuiz.size();i++){
            String item ="Titre:"+ListeQuiz.get(i).getNom()+"Date d'ouverture:"+ListeQuiz.get(i).getDateOuverture()+"Date d'expiration:"+ListeQuiz.get(i).getDateExpiration();
            list.add(item);
        }

        listView.setItems(list);

        listView.setOnMouseClicked(new EventHandler<MouseEvent>(){

                                       @Override
                                       public void handle(MouseEvent arg0) {
                                            Quiz notionobj = new Quiz() ;
                                           VBox layout= new VBox(5);
                                           label.setText("Selected: " + listView.getSelectionModel().getSelectedItems());
                                           Parent notion= null;
                                           try {
                                               notion = FXMLLoader.load(getClass().getResource("NOTHING.fxml"));
                                           } catch (IOException e) {
                                               e.printStackTrace();
                                           }


                                       } });}*/

    public void affichernotion(ActionEvent event) throws IOException {
       // String not = notion.getText();
        final Label label = new Label("Selected: ");


        final ListView<String> listView = new ListView<>();
        ObservableList<String> list = FXCollections.observableArrayList ();

        for(int i=0;i<ListNotion.size();i++){
            String item =ListNotion.get(i).getNotion();
            list.add(item);
        }

        listView.setItems(list);

        listView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent arg0) {
                Notion notionobj = new Notion() ;
                VBox layout= new VBox(5);
                label.setText("Selected: " + listView.getSelectionModel().getSelectedItems());
                Parent notion= null;
             /*   try {
                 //   notion = FXMLLoader.load(getClass().getResource("NOTHING.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }*/


                for(int i=0;i<ListNotion.size();i++){
                  String awal =ListNotion.get(i).getNotion();
                  String nomtanotion="Selected: ["+awal+"]";


                    System.out.println("le get "+ nomtanotion);
                    String word = label.getText();
                    System.out.println("le label est "+ word);
                    if (nomtanotion.equals(word)){
                        //---------------------------afficher les questions
                        ArrayList <QCM>  ListQCM = ListNotion.get(i).getListeQCM();
                        System.out.println(" le size est:"+ListQCM.size());
                        for(int j=0;j<ListQCM.size();j++){
                            Label labelfirst= new Label("Question QCM "+ j+ " : "+ListQCM.get(j).getQuestion());
                            Label labelresponse= new Label();


                         //   Button button= new Button("Submit");

                            RadioButton radio1, radio2, radio3, radio4;
                            radio1= new RadioButton(ListQCM.get(j).getPropositionQCM().get(0).getProposition());
                            radio2= new RadioButton(ListQCM.get(j).getPropositionQCM().get(1).getProposition());
                            radio3= new RadioButton(ListQCM.get(j).getPropositionQCM().get(2).getProposition());
                            radio4= new RadioButton(ListQCM.get(j).getPropositionQCM().get(3).getProposition());




                            layout.getChildren().addAll(labelfirst, radio1, radio2, radio3, radio4,labelresponse);




                        }
                        //---------------question qcm ----------------------------//
                        ArrayList <QCU>  ListQCU = ListNotion.get(i).getListeQCU();

                        for(int j=0;j<ListQCU.size();j++){
                            Label labelfirst= new Label("Question QCU "+ j+ " : "+ListQCU.get(j).getQuestion());
                            Label labelresponse= new Label();


                            //   Button button= new Button("Submit");

                            RadioButton radio1, radio2, radio3, radio4;
                            radio1= new RadioButton(ListQCU.get(j).getPropositionQCU().get(0).getProposition());
                            radio2= new RadioButton(ListQCU.get(j).getPropositionQCU().get(1).getProposition());
                            radio3= new RadioButton(ListQCU.get(j).getPropositionQCU().get(2).getProposition());
                            radio4= new RadioButton(ListQCU.get(j).getPropositionQCU().get(3).getProposition());


                            layout.getChildren().addAll(labelfirst, radio1, radio2, radio3, radio4,labelresponse);

                        }
                        //-----------------------------------QUESTION OUVERTE --------------
                        ArrayList <QO>  ListQO = ListNotion.get(i).getListeQO();

                        for(int j=0;j<ListQO.size();j++){
                            Label labelfirst= new Label("Question Ouverte  "+ j+ " : "+ListQO.get(j).getQuestion());
                            Label labelresponse= new Label("La reponse est:" + ListQO.get(j).getReponse());







                            layout.getChildren().addAll(labelfirst,labelresponse);

                        }


                        break ;
                    }
                }

                 // String question = notionobj.getNotion();
                Scene scene1= new Scene(layout, 700, 400);
                //  Scene tNotion = new Scene(notion);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene1);
                window.show();


            }

        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, listView);
        Stage primaryStage=new Stage();
        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }
    ///*******************************************Liste Notions 2 ****************************************************///


    public void creerquiz(ActionEvent event) throws IOException {

        Quiz quiz = new Quiz(tittreQuiz.getText(),dateOuverture.getText(),dateExpiration.getText(),nbNotions.getPrefColumnCount(),ListNotion);
        ListeQuiz.add(quiz);
        System.out.println("quiz cree avec succes");
        Parent root = FXMLLoader.load(getClass().getResource("Quiz.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();



    }



    public void modificationnotion(ActionEvent event) throws IOException {
        final Label label = new Label("Selected: ");
        final ListView<String> listView = new ListView<>();
        ObservableList<String> list = FXCollections.observableArrayList ();
        System.out.println("se de tabl notion iz"+ListNotion.size());

        for(int i=0;i<ListNotion.size();i++){
            String item =ListNotion.get(i).getNotion();
            list.add(item);
        }

        listView.setItems(list);

        listView.setOnMouseClicked(new EventHandler<MouseEvent>(){


            @Override
            public void handle(MouseEvent arg0) {

                label.setText("Selected: " +
                        listView.getSelectionModel().getSelectedItems());
                Parent notion= null;
                try {
                    notion = FXMLLoader.load(getClass().getResource("NOTHING.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }


                for(int i=0;i<ListNotion.size();i++){
                    String awal =ListNotion.get(i).getNotion();
                    String nomtanotion="Selected: ["+awal+"]";


                    System.out.println("le get "+ nomtanotion);
                    String word = label.getText();
                    System.out.println("le label est "+ word);
                    if (nomtanotion.equals(word)) {
                        //---------------------------afficher les questions
                        objetnotion=ListNotion.get(i);
                        break;
                    }}


                Scene tNotion = new Scene(notion);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tNotion);
                window.show();
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, listView);
        Stage primaryStage=new Stage();
        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }
    public void afficherquiz (ActionEvent event) throws IOException {
        final Label label = new Label("Selected: ");

        VBox layout= new VBox(5);
        final ListView<String> listView = new ListView<>();
        ObservableList<String> list = FXCollections.observableArrayList ();

        for(int i=0;i<ListeQuiz.size();i++){
            String item =ListeQuiz.get(i).getNom();
            list.add(item);
        }

        listView.setItems(list);

        listView.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent arg0) {

                VBox layout= new VBox();
                label.setText("Selected: " + listView.getSelectionModel().getSelectedItems());
                Parent quiz= null;
                try {
                    quiz = FXMLLoader.load(getClass().getResource("mesNotion.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene tNotion = new Scene(quiz);
                Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(tNotion);
                window.show();



                }





        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, listView);
        Stage primaryStage=new Stage();
        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();


    }

    public void remplirpropositionqcm(ActionEvent event) throws IOException {
        String quest= question.getText();
        System.out.println(quest);

        String propv1 = propjuste1.getText();
        String propv2 = propjuste2.getText();
        String propf1 =propfausse1.getText();
        String propf2 =propfausse2.getText();

        //-------------------creer la listes des propositions vrais et fausses-------------------------
        ArrayList<Proposition> ListePropv= new ArrayList<>();
        ArrayList<Proposition>ListePropf= new ArrayList<>();

        Proposition proposition1= new Proposition(propv1);
        ListePropv.add(proposition1);
        Proposition proposition2= new Proposition(propv2);
        ListePropv.add(proposition2);
        Proposition proposition3= new Proposition(propf1);
        ListePropf.add(proposition3);
        Proposition proposition4= new Proposition(propf2);
        ListePropf.add(proposition4);
        //----------------------- creer map ds auetion reponce juste -----------------------------

        Map<Question,Reponse> mapReponsejuste= new HashMap<Question,Reponse>();

        ArrayList<Proposition> listproposition = new ArrayList<>();
        listproposition.add(proposition1);
        listproposition.add(proposition2);
        listproposition.add(proposition3);
        listproposition.add(proposition4);

        ArrayList <String> repjuste = new ArrayList<>();
        repjuste.add(propv1);
        repjuste.add(propv2);
        //---------creer le qcm------------------------
        ReponseQCM repqcm = new ReponseQCM(repjuste);

        QCM  qcm = new QCM (quest,listproposition);
        ListQCM.add(qcm);
        //System.out.println("le size est :"+ListQCM.size());
        mapReponsejuste.put(qcm,repqcm) ;
        objetnotion.setListeQCM(ListQCM);
       // System.out.println("le size 2 est"+objetnotion.getListeQCM().size());
        //******************************************************************************************
        Parent root = FXMLLoader.load(getClass().getResource("NOTHING.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }



    public void remplirpropositionqcu(ActionEvent event) throws IOException {
        String quest= question2.getText();
        System.out.println(quest);

        String propv1 = propov1.getText();
        String propf1 =propof1.getText();
        String propf2 =propof2.getText();
        String propf3 =propof3.getText();

        //-------------------creer la listes des propositions vrais et fausses-------------------------
        ArrayList<Proposition> ListePropv= new ArrayList<>();
        ArrayList<Proposition>ListePropf= new ArrayList<>();

        Proposition proposition1= new Proposition(propv1);
        ListePropv.add(proposition1);
        Proposition proposition2= new Proposition(propf3);
        ListePropv.add(proposition2);
        Proposition proposition3= new Proposition(propf1);
        ListePropf.add(proposition3);
        Proposition proposition4= new Proposition(propf2);
        ListePropf.add(proposition4);
        //----------------------- creer map ds auetion reponce juste -----------------------------

        Map<Question,Reponse> mapReponsejuste= new HashMap<Question,Reponse>();

        ArrayList<Proposition> listproposition = new ArrayList<>();
        listproposition.add(proposition1);
        listproposition.add(proposition2);
        listproposition.add(proposition3);
        listproposition.add(proposition4);

        ArrayList <String> repjuste = new ArrayList<>();
        repjuste.add(propv1);
       // repjuste.add(propv2);
        //---------creer le qcm------------------------
        ReponseQCU repqcu = new ReponseQCU(propv1);
        QCU  qcu = new QCU (quest,listproposition);
        ListQCU.add(qcu);
        mapReponsejuste.put(qcu,repqcu) ;
        objetnotion.setListeQCU(ListQCU);
        // System.out.println("le size 2 est"+objetnotion.getListeQCM().size());
        //******************************************************************************************
        Parent root = FXMLLoader.load(getClass().getResource("NOTHING.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }
    public void remplirpropositionqo(ActionEvent event) throws IOException {
        String quest= question3.getText();
        System.out.println(quest);

        String rep = repqo.getText();


        //----------------------- creer map ds auetion reponce juste -----------------------------

        Map<Question,Reponse> mapReponsejuste= new HashMap<Question,Reponse>();



        ArrayList <String> repjuste = new ArrayList<>();
        repjuste.add(rep);
        // repjuste.add(propv2);
        //---------creer le qcm------------------------
        ReponseQO repqo = new ReponseQO(rep);
        QO qo = new QO (quest,rep);
        ListQO.add(qo);
        mapReponsejuste.put(qo,repqo) ;
        objetnotion.setListeQO(ListQO);
        // System.out.println("le size 2 est"+objetnotion.getListeQCM().size());
        //******************************************************************************************
        Parent root = FXMLLoader.load(getClass().getResource("NOTHING.fxml")); // ychargili la page profil li ani haba nroh liha
        Stage primaryStage=new Stage();
        primaryStage.setTitle("ESI-QUIZZ ");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();

    }
    public void VisualQcm(ActionEvent event)throws IOException{
        Stage primaryStage=new Stage();

        primaryStage.setTitle("Test Question 1");

        Label labelfirst= new Label("What is 10 + 20?");
        Label labelresponse= new Label();


        Button button= new Button("Submit");

        RadioButton radio1, radio2, radio3, radio4;
        radio1=new RadioButton("10");
        radio2= new RadioButton("20");
        radio3= new RadioButton("30");
        radio4= new RadioButton("40");


        button.setDisable(true);

        radio1.setOnAction(e -> button.setDisable(false) );
        radio2.setOnAction(e -> button.setDisable(false) );
        radio3.setOnAction(e -> button.setDisable(false) );
        radio4.setOnAction(e -> button.setDisable(false) );
        VBox layout= new VBox(5);

        layout.getChildren().addAll(labelfirst, radio1, radio2, radio3, radio4, button, labelresponse);

        Scene scene1= new Scene(layout, 700, 400);
        primaryStage.setScene(scene1);

        primaryStage.show();


}}

   /* public void afficherQuiz(ActionEvent event) throws IOException {
      //  Quiz quiz3 = new Quiz ("quizTest2","12/12/2017","13/10/1018",1,ListNotion,mapExo);
      //  Quiz quiz = new Quiz ("quizTest","12/12/2017","13/10/1018",1,ListNotion);
     //   notion.ajouterQuestion(qcm);

            String elem1=" Quiz:"+tittreQuiz.getText()+"Date d'ouverture:"+dateOuverture.getText()+" Date d'expiration:"+dateExpiration.getText();
            listeView1.getItems().add(elem1);
            listeView2.getItems().add(ListNotion.get(0).getListeQCM().get(0).getQuestion());

          ArrayList<String>li= new ArrayList<String>();
        ArrayList<String>ji= new ArrayList<String>();

           for (int i=0 ; i<ListNotion.size();i++)
            {
                li.add("Notion "+ i +ListNotion.get(i).getNotion());
                li.add(ListNotion.get(i).getListeQCM().get(i).getQuestion()+",les propositions : /n");
                for(int j=0;j<ListNotion.get(i).getListeQCM().get(i).getPropositionQCM().size();j++){
                    ji.add(ListNotion.get(i).getListeQCM().get(i).getPropositionQCM().get(j).getProposition()+"/n");

                }
                getPropositionQCM().get(i).getProposition());
            }
        for (String elem :li)
        {
            mlisteView.getItems().add(elem);
        }






         /*   System.out.println(" la liste des notions:");
            Notion n;





            for(int i=0;i<this.listeNotions.size();i++)
            {
                n= this.listeNotions.get(i);
                n.afficherNotion();

            }
            System.out.println(" le nombre de questions:"+exercice.size());

            for(Map.Entry<Question, Reponse> entry: exercice.entrySet()) {
                System.out.println(" la question:");
                entry.getKey().afficherQuestion();
            }*/





