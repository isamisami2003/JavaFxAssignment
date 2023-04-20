/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class RegisterPageController implements Initializable {

    @FXML
    private Button LoginButton;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField txtuserName;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoginButtonHandler(ActionEvent event) {
        if(txtuserName.getText().equals("ismail") &&txtPassword.getText().equals("1234")){
            ViewManager.regPage.changeSceneToUserPage();   
    }
}
}

