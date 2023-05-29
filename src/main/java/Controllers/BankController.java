package Controllers;
import Models.SavingsAccount;

public class BankController {
    SavingsAccount obj;
    
    public SavingsAccount addSavingsAccout(String ownerName, int accountNo, float balance,float i, boolean f){
        obj = new SavingsAccount(ownerName, accountNo, balance, i, f);
        return obj;
    }
}
