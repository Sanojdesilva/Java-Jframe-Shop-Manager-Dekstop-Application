/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;
import Models.Watch;
import DataBaseConnection.DBconnector;
/**
 *
 * @author Sanoj de silva
 */
public class WatchAccess {
    private DBconnector singleInstnace;
    
    public WatchAccess(){
        singleInstnace = DBconnector.getSingleInstance();
    }
    
    public boolean AddWatch(Watch wobj){
        try{
            String query = "insert into watches values ('"+wobj.getWatchType()+"','"+wobj.getBrand()+"','"+wobj.getNo()+"',"+wobj.getPrice()+" , "+wobj.getQuantity()+" ); ";
            boolean result = singleInstnace.ExecuteQuary(query);
            return result ;
        }catch(Exception ex){
            return false ;
        }
    }
    
    public boolean UpdateWatch( String type , String Brand ,String no , double price , int Quantity){
        try{
            String query = "update watches set WatchType = '"+type+"' ,Brand = '"+Brand+"' , Price = "+price+" , Quantity = "+Quantity+" where ModelNo = '"+no+"' ); ";
            boolean result = singleInstnace.ExecuteQuary(query);
            return result ;
        }catch(Exception ex){
            return false ;
        }
    } 
    
    public boolean deleteWatch( String no ){
        try{
            String query = "update watches set WatchType = 'null' ,Brand = 'null' , Price = null , Quantity = null where ModelNo = '"+no+"' ); ";
            boolean result = singleInstnace.ExecuteQuary(query);
            return result ;
        }catch(Exception ex){
            return false ;
        }
    } 
}
