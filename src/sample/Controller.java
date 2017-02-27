package sample;

import com.sun.tools.internal.xjc.generator.bean.field.ContentListField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    TextField name;
    @FXML
    TextField phone;
    @FXML
    TextField email;
    @FXML
    ListView list;

    public void add(){
        if(name.getText().equalsIgnoreCase("") || phone.getText().equalsIgnoreCase("") || email.getText().equalsIgnoreCase("")) {

        } else {
            contacts.add(new Contact(name.getText(), phone.getText(), email.getText()));
            name.setText(""); phone.setText(""); email.setText("");
        }
    }
    public void remove(){
        Contact contact = (Contact) list.getSelectionModel().getSelectedItem();

        contacts.remove(contact);
    }

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        list.setItems(contacts);
    }


}
