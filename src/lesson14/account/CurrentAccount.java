package lesson14.account;

public class CurrentAccount implements Account{
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance + this.overdraftLimit >= amount){
            this.balance -= amount;
        }else{
            System.out.println("Суммы для снятия на счету нет");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
