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
public class Employee {
    private String name ;
    private String Address ;
    private String Possition ;
    private String empId ;
    private String tp ;
    private double Salary ;
    private String username ;
    private String Password ;

    public Employee(String name, String Address, String Possition, String empId, String tp, double Salary, String username, String Password) {
        this.name = name;
        this.Address = Address;
        this.Possition = Possition;
        this.empId = empId;
        this.tp = tp;
        this.Salary = Salary;
        this.username = username;
        this.Password = Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPossition() {
        return Possition;
    }

    public void setPossition(String Possition) {
        this.Possition = Possition;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
