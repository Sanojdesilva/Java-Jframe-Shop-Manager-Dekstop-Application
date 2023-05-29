/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Models.Payment;

public class PaymentController {
    Payment p ;
    
    public Payment addInvoice(String invoice , String type){
        p = new Payment(invoice,type);
        return p ;
    }
      
    public double SalesPayment(double price,double sum){
        double pay = p.SalesPayment(price,sum);
        return pay;
       
    }
    public double RepairJobs(double advance , double fullpayment){
        double bal = p.BRepairJob(advance, fullpayment);
        return bal;
    }
    public boolean paymet(double value,double billPayment){
        boolean amount = p.Cuspaymet(value, billPayment);
        return amount;
    }
    
 }


