/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import DBAccess.UserNameAccess;

/**
 *
 * @author Sanoj de silva
 */
public class UserLoginController {
    UserNameAccess ul ;
    
    public UserLoginController(){
        ul = new UserNameAccess();        
    }
    
    public boolean CheckUsername(String Username){
        boolean result = ul.checkUserNameValidations(Username);
        return result ;
    }
    
    public boolean CheckPassword(String Password){
        boolean result = ul.checkUserNameValidations(Password);
        return result ;
    }
    
}
