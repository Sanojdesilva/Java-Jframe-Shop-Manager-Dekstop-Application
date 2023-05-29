/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Supplier;
import DBAccess.SupplierAccess;

/**
 *
 * @author Sanoj de silva
 */
public class SupplierControl {
    Supplier sup;
    SupplierAccess supa;

    public SupplierControl() {
        supa = new SupplierAccess();
    }
    
    public Supplier addSupplier(String SID, String Item, String Sname, int rating){
        sup = new Supplier(SID, Item, Sname, rating);
        return sup ;
    }
    
    public boolean AddToTheDB(Supplier sup2){
        boolean result = supa.AddSupplier(sup2);
        return result ;
    }
    
    public boolean UpdateTheDB(String sname , String sid , String item , int rating){
        boolean result = supa.UpdateSupllier(sname,sid, item,rating);
        return result ;
    }
    
    public boolean DeleteFromDB(String sid){
        boolean result = supa.deleteSuplier(sid);
        return result ;
    }
}
