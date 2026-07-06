package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList< Account> accounts = new ArrayList<>();


    public void createANewAccount(String firstName, String lastName, String pin) {
                Account account = new Account(accounts.size()+1 , firstName , lastName , pin);
                accounts.add(account);
    }

    public int countAccounts(){
        return accounts.size();
    }

    public double checkInitialBalance(int accountNumber, String pin) {
        Account account = accounts.get(accountNumber-1);
        double values = 0;
        if(account.getPin().equals(pin)){
           values = account.getBalance();
        }
        return values;
    }

    public void deposit(int accountNumber, int amount) {
        Account account = accounts.get(accountNumber -1);
        account.deposit(amount);
    }


    public void removeAccount(int accountNumber, String pin) {
        Account account = accounts.get(accountNumber-1);
        accounts.remove(account);
    }

    public void withdraw(int accountNumber, String pin, int amount) {
        Account account = accounts.get(accountNumber -1);
        accounts.withdraw(account);
    }
}
