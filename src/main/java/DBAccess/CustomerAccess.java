/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;
import Models.Customer;
import DataBaseConnection.DBconnector;
/**
 *
 * @author Sanoj de silva
 */
public class CustomerAccess {
    private  DBconnector singleConn ;
    
    public CustomerAccess(){
        singleConn = DBconnector.getSingleInstance();
    }
    
    public boolean AddCustomer(Customer cus){
        try{
            String query = "insert into customer values('"+cus.getName()+"','"+cus.getID()+"','"+cus.getEmail()+"');";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
            
    }
        
}
