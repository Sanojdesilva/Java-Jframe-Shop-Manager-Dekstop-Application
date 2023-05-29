
package DBAccess;
import DataBaseConnection.DBconnector;
import Models.Employee ;


public class EmployeeAccess {
    DBconnector singleInstance ;
    
    public EmployeeAccess(){
        singleInstance = DBconnector.getSingleInstance();
    }
    
    public boolean AddEmployee(Employee emp){
        try{
            String Query = "insert into employee values ( '"+emp.getName()+"' , '"+emp.getAddress()+"' , '"+emp.getTp()+"' , '"+emp.getEmpId()+"' , '"+emp.getPossition()+"' , "+emp.getSalary()+" , '"+emp.getUsername()+"' , '"+emp.getPassword()+"' )";
            boolean result = singleInstance.ExecuteQuary(Query);
            return result ;
        }catch(Exception ex){
            return false ;
        }
              
    }
    
    public boolean UpdateEmployee(String name , String address , String tp , String empid , String possition , double salary ){
        try{
            String query = "update employee set Name = '"+name+"' , Address = '"+address+"' , Tp = '"+tp+"' , Possition = '"+possition+"' , Salary = "+salary+" where  EmployeeID = '"+empid+"'" ;
            boolean result = singleInstance.ExecuteQuary(query);
            return result ;
        }catch(Exception ex){
            return false ;
        }
    }
    
    public boolean deleteEmployee( String empid ){
        try{
            String query = "update employee set Possition = 'deleted' , Salary = null where  EmployeeID = '"+empid+"'" ;
            boolean result = singleInstance.ExecuteQuary(query);
            return result ;
        }catch(Exception ex){
            return false ;
        }
    }
    
    
}
