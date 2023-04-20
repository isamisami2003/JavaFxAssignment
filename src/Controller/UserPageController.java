/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewManager;
import com.sun.deploy.config.JREInfo;
import static com.sun.deploy.config.JREInfo.clear;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class UserPageController implements Initializable {

    @FXML
    private Button logOutButton;
    @FXML
    private Button convertButton;
    @FXML
    private TextField txtUsd;
    @FXML
    private TextField txtNis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void LogOutButtonHandler(ActionEvent event) throws IOException {
        clear();
        ViewManager.closeUserPage();
        ViewManager.changeSceneToRegisterPage();
    }

    @FXML
    private void convertButtonHandler(ActionEvent event) {
            String usdtxt = txtUsd.getText();
            double usd = Double.parseDouble(usdtxt);
            double Result = (double) (usd * 3.53);
            txtNis.setText(String.valueOf(Result));
    }
    
}
