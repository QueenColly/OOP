package bankApp;

public class Account {

    private double balance;
    private int pin;

    public Account(int pin){
        this.pin = pin;
    }

    public boolean isValidPin(int pin){
        return this.pin == pin;
    }

    public void deposit(int amount) {
        if (amount <= 0) throw new IllegalArgumentException("deposit must be positive");
        balance += amount;
    }

    public double checkBalance(int pin) {
        if (!isValidPin(pin)) throw new IllegalArgumentException("invalid pin");
        return balance;
    }

    public void withdraw(int pin, int amount) {
        boolean isLesser = amount < balance && amount > 0;
        if (isLesser && isValidPin(pin)) balance -= amount;
        else throw new IllegalArgumentException("invalid pin");
    }
}