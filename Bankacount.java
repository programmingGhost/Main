public class Bankacount {

    // ------------------------------------ properties

    private double balance;

    // ---------------------------------- methods

    public Bankacount(double initialBalance) { // constructor
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // other methods

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdaw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}
