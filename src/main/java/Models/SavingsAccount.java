package Models;

public class SavingsAccount extends BankAccount{
    float interestRate;
    boolean flag;
    static int tosavingsAccount;
    
    public SavingsAccount(String ownerName, int accountNo, float balance,float i, boolean f){
        super(ownerName,accountNo,balance);
        this.interestRate = interestRate;
        this.flag = flag;
        
        tosavingsAccount++;
    }
    
    public SavingsAccount(){
        super();
        this.interestRate = 0.0f;
        this.flag = false;
    }
    
    public float calBalance(){
        return (super.getBalance() * this.interestRate)+super.getBalance() ;
    }
    
    @Override
    public String printAccount(){
        return super.printAccount() + " " + this.interestRate +" "+this.flag;
    } 

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    public static int getTosavingsAccount(){
        return tosavingsAccount;
    }
}
