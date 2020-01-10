package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import tp.Notion;

import java.net.URL;
import java.util.ResourceBundle;

public class tablenotionsController implements Initializable {
    @FXML private TableView<Notion> list;
    @FXML private TableColumn<Notion, String> firstNameColumn;
    @FXML private TableColumn<Notion,Notion> lastNameColumn;
    public void initialize(URL location, ResourceBundle resources)
    {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Notion, String>("firstName"));
       // lastNameColumn.setCellValueFactory(new PropertyValueFactory<Notion, String>(notion ));

    }
}