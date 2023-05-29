/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;
import DataBaseConnection.DBconnector;
import Models.Task;
import Models.CurrentTask;

/**
 *
 * @author Sanoj de silva
 */
public class taskAcess {
    DBconnector singleInstence ;
    
    public taskAcess(){
        singleInstence = DBconnector.getSingleInstance();
    }
    
    public boolean addTask(Task ts){
        try{
           String query = "insert into task values ( '"+ts.getTaskId()+"','"+ts.getTaskType()+"',"+ts.getPrice()+" )" ;
           boolean result = singleInstence.ExecuteQuary(query); 
           return result ;
        }catch(Exception ex){
           return false ;
        }       
    }
    
    
    
    public boolean addCurrentTask(CurrentTask cts){
        try{
           String query = "insert into currenttask values ( '"+cts.getAddDate()+"' , '"+cts.getCollecteddate()+"' , '"+cts.getSelectedTask()+"' , "+cts.getTotalPayement()+" , "+cts.getAdvancedPayment()+" , "+cts.getBalance()+" , 'Pending'  , '"+cts.getStatus()+"' , '"+cts.getEmpID()+"' , '"+cts.getCustomerID()+"' )" ;
           boolean result = singleInstence.ExecuteQuary(query); 
           return result ;
        }catch(Exception ex){
           return false ;
        }       
    }
    
    public boolean UpdateCurrentTask(String AddDate, String Collecteddate, String selectedTask,String status,String empid,String CusID){
        try{
           String query = " update currenttask set  CollectedDate = '"+Collecteddate+"' , Status = '"+status+"' where EmpId = '"+empid+"' and AddDate = '"+AddDate+"' and SelectedTask = '"+selectedTask+"' and CustomerID = '"+CusID+"' "  ;
           boolean result = singleInstence.ExecuteQuary(query); 
           return result ;
        }catch(Exception ex){
           return false ;
        }       
    }
    
    public boolean DeleteCurrentTask(String AddDate,  String selectedTask , String empid , String cusID ){
        try{
           String query = " update currenttask set  CollectedDate = null , TotalPaymnet = null , AdvancedPaymnet = null , Balanced = null , Status = null where EmpId = '"+empid+"' and AddDate = '"+AddDate+"' and SelectedTask = '"+selectedTask+"' and CustomerID = '"+cusID+"' ";
           boolean result = singleInstence.ExecuteQuary(query); 
           return result ;
        }catch(Exception ex){
           return false ;
        }       
    }
}
