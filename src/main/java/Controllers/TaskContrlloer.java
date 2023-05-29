/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Task;
import DBAccess.taskAcess;

/**
 *
 * @author Sanoj de silva
 */
public class TaskContrlloer {
    Task ts1 ;
    taskAcess tsa1 ;
    
    
    public TaskContrlloer(){
        tsa1 = new taskAcess();
    }
    
    public Task addTask(String TaskId, String TaskType , double price){
        ts1 = new Task(TaskId,TaskType,price);
        return ts1 ;
    }
    
    public boolean addtoDB(Task t1){
        boolean result = tsa1.addTask(t1);
        return result ;
    }
}
