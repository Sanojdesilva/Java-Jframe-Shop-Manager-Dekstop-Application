/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.SpareParts;
import DBAccess.WatchSparePartsAccess;

/**
 *
 * @author AKILA KASUN
 */
public class SparePartsControl {
    
    SpareParts sp1;
    WatchSparePartsAccess sp2;
    
    public SparePartsControl(){
        
         sp2 = new WatchSparePartsAccess();
    }
    
    public SpareParts SparePartsAdd(String SparePartType, int Quantity, String WatchType)
    {
           sp1 = new SpareParts(SparePartType,Quantity,WatchType);
        
           return sp1;
    
     }
    
    public boolean AddToDataBase(SpareParts sp){
        
        boolean result = sp2.AddSpareParts(sp);
        
        return result;
    }
    
    public boolean UpdateDataBase(String SpType , int quantity , String WatchType){
        boolean result = sp2.UpdateSpareParts(SpType, quantity, WatchType);
        return result ;
    }
    
    public boolean deleteDataBase(String SpType , String WatchType){
        boolean result = sp2.deleteSpareParts(SpType, WatchType);
        return result ;
    }
}
