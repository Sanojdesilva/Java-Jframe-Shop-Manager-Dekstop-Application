/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;
import Models.SpareParts;
import DataBaseConnection.DBconnector;


public class WatchSparePartsAccess {
    
    private DBconnector SingleInstance;
    
    public WatchSparePartsAccess(){
         
        SingleInstance = DBconnector.getSingleInstance();
        
        
    }
    
    public boolean AddSpareParts(SpareParts sp2){
        try{
            String Quary = "insert into spareparts values ('"+sp2.getSparePartType()+"',"+sp2.getQuantity()+" ,'"+sp2.getWatchType()+"');";
        
            boolean result =SingleInstance.ExecuteQuary(Quary);
        
            return result;
        }
        catch (Exception ex) {
            
            return false;
        }
        
    }
    
    public boolean UpdateSpareParts(String val1 , int val2 , String val3){
        try{
            String Quary = "update spareparts set Quantity = "+val2+" where SPType = '"+val1+"' and WatchType = '"+val3+"' ";
        
            boolean result =SingleInstance.ExecuteQuary(Quary);
        
            return result;
        }
        catch (Exception ex) {
            
            return false;
        }
        
    }
            
    public boolean deleteSpareParts(String val1 , String val3){
        try{
            String Quary = "update spareparts set Quantity = null where SPType = '"+val1+"' and WatchType = '"+val3+"' ";
        
            boolean result =SingleInstance.ExecuteQuary(Quary);
        
            return result;
        }
        catch (Exception ex) {
            
            return false;
        }
        
    }
}
