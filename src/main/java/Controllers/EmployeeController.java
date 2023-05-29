/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Models.Employee;
import DBAccess.EmployeeAccess;

/**
 *
 * @author Sanoj de silva
 */
public class EmployeeController {
    Employee emp ;
    EmployeeAccess empA ;
    
    public EmployeeController(){
        empA = new EmployeeAccess();
    }
    
    public Employee addEmp(String name, String Address, String Possition, String empId, String tp, double Salary, String username, String Password){
        emp = new Employee(name,Address,Possition,empId,tp,Salary,username,Password);
        return emp ;
    }
    public boolean addToDBEmp(Employee em){
        boolean result = empA.AddEmployee(em);
        return result ;
    }
    
    public boolean UpdateDBEmp(String name, String Address, String Possition, String empId, String tp ,double Salary){
        boolean result = empA.UpdateEmployee(name, Address, tp, empId, Possition, Salary);
        return result ;
    }
    
    public boolean deleteDBEmp( String empId){
        boolean result = empA.deleteEmployee(empId);
        return result ;
    }
}
