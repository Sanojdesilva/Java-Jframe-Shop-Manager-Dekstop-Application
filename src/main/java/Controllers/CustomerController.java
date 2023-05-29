/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Customer;
import DBAccess.CustomerAccess;


/**
 *
 * @author Sanoj de silva
 */
public class CustomerController {
    Customer cOBJ ;
    CustomerAccess caOBJ;
    
    public CustomerController(){
        caOBJ = new CustomerAccess();
    }
    
    public Customer AddCustomer(String name , String ID ,String email){
        cOBJ = new Customer(name,ID,email);
        return cOBJ;
    }
    
    public boolean InsterCustomerToDB(Customer c1){
        boolean result = caOBJ.AddCustomer(c1);
        return result;
    }
    
    

}
