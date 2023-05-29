
 
package DBAccess;
import DataBaseConnection.DBconnector;




public class UserNameAccess {
    DBconnector singleInstence ;
    
    
    public UserNameAccess(){
        singleInstence = DBconnector.getSingleInstance();
    }
    public boolean checkUserNameValidations(String UserNAme){
        try{
            String Query = "select * from employee where Username = '"+UserNAme+"' ";
            boolean result = singleInstence.ExecuteQuary(Query);   
            return result ;
        }catch(Exception ex){
            return false ;
        }    
    }
    
    public boolean checkPasswordValidations(String Password){
        try{
            String Query = "select * from employee where Username = '"+Password+"' ";
            boolean result = singleInstence.ExecuteQuary(Query);   
            return result ;
        }catch(Exception ex){
            return false ;
        }    
    }
}
