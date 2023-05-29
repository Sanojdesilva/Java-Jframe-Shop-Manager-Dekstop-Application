package Models;

public class BankAccount {
    private String ownerName;
    private int accountNo;
    private float balance;

    public BankAccount(String ownerName, int accountNo, float balance) {
        this.ownerName = ownerName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount() {
        this.ownerName = null;
        this.accountNo = 0;
        this.balance = 0.0f;
    }
    
    public String printAccount(){
        return ownerName+" "+accountNo+" ("+ balance+")";
    }

    public String getOwerName() {
        return ownerName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    
    
}
