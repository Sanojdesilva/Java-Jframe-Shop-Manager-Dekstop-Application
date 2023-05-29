/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Watch;
import DBAccess.WatchAccess;
/**
 *
 * @author Sanoj de silva
 */
public class WatchControl {
    Watch w;
    WatchAccess waobj;
    
    public WatchControl(){
        waobj = new WatchAccess();
    }
    
    public Watch AddWatch(String no, String brand, double price,String WatchType , int Quantity){
        w = new Watch(no,brand,price,WatchType,Quantity);
        return w;
    }
    
    
    public boolean AddWatchToDB(Watch w1){
        boolean result = waobj.AddWatch(w1);
        return result ;
    }
    
    public boolean UpdateWatch( String type , String Brand ,String no , double price , int Quantity){
        boolean result = waobj.UpdateWatch(type, Brand, no, price, Quantity);
        return result;
    }
    
    public boolean deleteWatch(String ModelNO ){
        boolean result = waobj.deleteWatch( ModelNO);
        return result;
    }
}
