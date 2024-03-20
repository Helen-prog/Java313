package lesson14.account;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(1000, 1.25);
        System.out.println("===== Сберегательный  счет =====\nПервоначальный депозит: $" + savingAccount.getBalance() + "\nПроцентная ставка: " + savingAccount.getInterestRate() + "%");

        CurrentAccount currentAccount = new CurrentAccount(5000, 1000);
        System.out.println("\n===== Текущий счет =====\nПервоначальный депозит: $" + currentAccount.getBalance() + "\nЛимит овердрафта: $" + currentAccount.getOverdraftLimit());

        Bank bank = new Bank();
        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nВносим 100 долларов на сберегательный счет.");
        bank.deposit(savingAccount, 100);

        System.out.println("\nВносим 500 долларов на текущий счет счет.");
        bank.deposit(currentAccount, 500);

        System.out.println("\nСберегательный счет и текущий счет =====");
        bank.printAccountBalances();

        System.out.println("Снимаем 150 долларов со сберегательного счета.\n");
        bank.withdraw(savingAccount, 150);

//        bank.withdraw(currentAccount, 6500);

        System.out.println("\nСберегательный счет и текущий счет =====");
        bank.printAccountBalances();

        savingAccount.applyInterest();
        System.out.println("\nПосле начисления процентов на сберегательный счет в течение 1 года");

        System.out.println("\nСберегательный счет и текущий счет =====");
        bank.printAccountBalances();
    }
}
