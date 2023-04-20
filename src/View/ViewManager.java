/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.UserPage;
import View.RegistrePage;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class ViewManager {
    public static RegistrePage regPage;
    public static UserPage userPage;
    
    private ViewManager(){}
    
    public static void openRegisterPage() throws IOException{
        if (regPage == null) {
            regPage = new RegistrePage();
            regPage.show();
        } else {
            regPage.show();
        }
        
    }
    public static void closeRegisterPage(){
        if(regPage != null)
            regPage.close();
    }
    
    public static void openUserPage() throws IOException{
        if (userPage == null) {
            userPage = new UserPage();
            userPage.show();
        } else {
            userPage.show();
        }
        
    }
    public static void closeUserPage(){
        if(userPage != null)
            userPage.close();
    }
}
