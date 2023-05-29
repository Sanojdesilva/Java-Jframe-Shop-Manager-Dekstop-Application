/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Sanoj de silva
 */
public class Task {
    private String TaskId;
    private String TaskType;
    private double price ;
   
    public Task(String TaskId, String TaskType , double price) {
        this.TaskId = TaskId;
        this.TaskType = TaskType;
        this.price = price ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getTaskId() {
        return TaskId;
    }

    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public String getTaskType() {
        return TaskType;
    }

    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }
    
    
}
