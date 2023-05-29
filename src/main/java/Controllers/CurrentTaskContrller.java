/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import DBAccess.taskAcess;
import Models.CurrentTask;

/**
 *
 * @author Sanoj de silva
 */
public class CurrentTaskContrller {
    CurrentTask cob ;
    taskAcess tob ;
    
    public CurrentTaskContrller(){
        tob = new taskAcess();
    }
    
    public CurrentTask addCT(String AddDate, String Collecteddate, String selectedTask, double totalPayement, double advancedPayment, double balance,String status , String empid , String cusID){
        cob = new CurrentTask(AddDate,Collecteddate,selectedTask,totalPayement,advancedPayment,balance,status,empid,cusID);
        return cob ;
    }
    
    public boolean addtoDB(CurrentTask cob){
        boolean result = tob.addCurrentTask(cob);
        return result ;
    }
    
    public boolean UpdateDB(String AddDate, String Collecteddate, String selectedTask, String status , String empid , String cusID){
        boolean result = tob.UpdateCurrentTask(AddDate, Collecteddate, selectedTask,status, empid,cusID);
        return result ;
    }
    
    public boolean DeleteFromDB(String AddDate,String selectedTask,String empid , String cusID){
        boolean result = tob.DeleteCurrentTask(AddDate, selectedTask, empid , cusID);
        return result ;
    }
}
