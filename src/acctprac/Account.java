package acctprac;

public class Account {
    private int balance;
    private String pin ;

    public int getBalance(){
        return balance;
    }
    //private void approvePin(String accessedPin){
    // if(!pin.equals(accessedPin)){
    // throw new SecurityException("invalid pin");}}

    public Account(String pin){
        this.pin = pin;
    }

    public void deposit(int amount) {
        boolean amountIsPositive = amount > 0;
       if( amountIsPositive) balance = balance + amount;
    }
    public void withdraw(int amount, String accessedPin) {
        if(!approvePin(accessedPin)){
            return;
        }

        if (amount > 0 && amount <= balance){
            balance = balance - amount;
        }
    }
   public void transfer(int amount) {
//        boolean amountIsPositive = amount > 0;
//        if (amount < balance && amountIsPositive){
//            int withdrawal;
//            balance = amount - withdrawal;
//        }
    }
    public boolean approvePin(String accessedPin) {
        return pin.equals(accessedPin);
    }
//    public void getWithdrawal(int amount) {
//        boolean amountIsNotPositive = amount < 0;
//        if(! amountIsNotPositive) balance = balance - amount;
//    }
}
