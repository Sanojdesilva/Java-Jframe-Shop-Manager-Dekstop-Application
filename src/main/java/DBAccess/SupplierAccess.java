/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;
import DataBaseConnection.DBconnector;
import Models.Supplier ;

/**
 *
 * @author Sanoj de silva
 */
public class SupplierAccess {
    private  DBconnector singleConn ;
    
    public SupplierAccess(){
        singleConn = DBconnector.getSingleInstance();
    }
    
    public boolean AddSupplier(Supplier sup){
        try{
            String query = "insert into supplier values('"+sup.getSname()+"','"+sup.getSID()+"','"+sup.getItem()+"',"+sup.getRating()+");";
            boolean result = singleConn.ExecuteQuary(query);
            return result;
        }catch(Exception ex){
            return false;
        }
            
    }
    
    public boolean UpdateSupllier(String val1 , String val2 , String val3 , int val4){
        try{
            String Quary = "update supplier set Sname = "+val1+" , Item = '"+val3+"' , Rating = "+val4+" where Sid = '"+val2+"' ";
        
            boolean result =singleConn.ExecuteQuary(Quary);
        
            return result;
        }
        catch (Exception ex) {
            
            return false;
        }
        
    }
            
    public boolean deleteSuplier(String val2){
        try{
            String Quary = "update supplier set Item = null where Sid = '"+val2+"' ";
        
            boolean result =singleConn.ExecuteQuary(Quary);
        
            return result;
        }
        catch (Exception ex) {
            
            return false;
        }
        
    }
}
