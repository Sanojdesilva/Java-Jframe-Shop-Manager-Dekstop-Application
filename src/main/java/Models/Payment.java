/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author acer
 */
public class Payment {
    private String InvoiceNo;
    private String PaymnetType;

    public Payment(String InvoiceNo, String PaymnetType) {
        this.InvoiceNo = InvoiceNo;
        this.PaymnetType = PaymnetType;
    }

    public String getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public String getPaymnetType() {
        return PaymnetType;
    }

    public void setPaymnetType(String PaymnetType) {
        this.PaymnetType = PaymnetType;
    }
    
    
    public double SalesPayment(double price,double sum){
        
        sum += price;
        return sum;
    }
    
    public double BRepairJob(double advance , double fullpayment){
        double balance = fullpayment - advance;
        return balance;
        
    }
    public boolean Cuspaymet(double value,double billPayment){
        double amount = value - billPayment;
        if(amount ==0){
            return true;
        }
            return false;
        
        
    }
}
