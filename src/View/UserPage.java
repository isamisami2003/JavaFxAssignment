/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class UserPage extends Stage {
    private Scene registerpage;
    private Scene userPage;
    
    public UserPage() throws IOException {
      //"model/UserPage.fxml" 
        
        FXMLLoader registerpageLoader = new FXMLLoader(getClass().getResource("FXMLView/RegisterPage.fxml"));
        Parent registerpageRoot = registerpageLoader.load();     
        registerpage = new Scene(registerpageRoot);
       
        FXMLLoader UserPageLoader = new FXMLLoader(getClass().getResource("FXMLView/UserPage.fxml"));
        Parent UserPageRoot = UserPageLoader.load();     
        userPage = new Scene(UserPageRoot);
        
        this.setScene(userPage);
        this.setTitle("User page");
    }
    
        public void changeSceneToRegisterPage(){
            this.setScene(registerpage);
        }
}
