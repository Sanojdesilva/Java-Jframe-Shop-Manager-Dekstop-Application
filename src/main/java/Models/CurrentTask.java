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
public class CurrentTask {
    private String AddDate ;
    private String Collecteddate ;  
    private String selectedTask ;
    private double totalPayement ;
    private double advancedPayment ;
    private double balance ;
    private String status ;
    private String EmpID ;
    private String customerID ;
    

    public CurrentTask(String AddDate, String Collecteddate, String selectedTask, double totalPayement, double advancedPayment, double balance ,String status , String empID , String CustomerID) {
        this.AddDate = AddDate;
        this.Collecteddate = Collecteddate;
        this.selectedTask = selectedTask;
        this.totalPayement = totalPayement;
        this.advancedPayment = advancedPayment;
        this.balance = balance;
        this.status = status ;
        this.EmpID = empID ;
        this.customerID = CustomerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddDate() {
        return AddDate;
    }

    public void setAddDate(String AddDate) {
        this.AddDate = AddDate;
    }

    public String getCollecteddate() {
        return Collecteddate;
    }

    public void setCollecteddate(String Collecteddate) {
        this.Collecteddate = Collecteddate;
    }

    public String getSelectedTask() {
        return selectedTask;
    }

    public void setSelectedTask(String selectedTask) {
        this.selectedTask = selectedTask;
    }

    public double getTotalPayement() {
        return totalPayement;
    }

    public void setTotalPayement(double totalPayement) {
        this.totalPayement = totalPayement;
    }

    public double getAdvancedPayment() {
        return advancedPayment;
    }

    public void setAdvancedPayment(double advancedPayment) {
        this.advancedPayment = advancedPayment;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
    
}
