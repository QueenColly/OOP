package bankApp;

public class Account {

    private double balance;
    private final String pin;
    private String name;
    private int accountNumber;

    public Account(String pin){
        this.pin = pin;
        this.balance = 0;
    }

    public Account(int accountNumber, String firstName, String lastName, String pin) {
        String name = firstName + " " + lastName;
        this.accountNumber = accountNumber;
        this.name = name;
        this.pin = pin;
    }

    public String isValidPin(String pin){
        if(this.pin.equals(pin)) {
            return this.pin;
        }
        else {
            return "Invalid Pin";
        }
    }

    public void deposit(int amount) {
        if (amount <= 0)
        throw new IllegalArgumentException("deposit must be greater than Zero");
        balance = balance + amount;
    }
    public void withdraw (String pin, int amount){
        validatePin(pin);

        if(amount <= 0)
            throw new IllegalArgumentException("Amount must be positive");

        if(amount > balance)
            throw new IllegalArgumentException("Insufficient funds");

        balance = balance - amount;
    }
    public double checkBalance(String pin) {
        // if (!isValidPin(pin))
        // throw new IllegalArgumentException("invalid pin");
        validatePin(pin);
        return balance;
    }
    public String getPin(){
        return pin;
    }
    private void validatePin(String pin){
        if(!this.pin.equals(pin))
            throw new IllegalArgumentException("Invalid Pin");

    }

    public double getBalance() {
        return this.balance;
    }
}