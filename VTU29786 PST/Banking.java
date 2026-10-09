 import java.util.*;

class BankAccount {
    private double balance;

    BankAccount() {
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        BankAccount account = new BankAccount();

        for (int i = 0; i < n; i++) {
            String operation = sc.nextLine();
            String[] parts = operation.split(" ");

            String type = parts[0];
            double amount = Double.parseDouble(parts[1]);

            if (type.equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else if (type.equalsIgnoreCase("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println((int) account.getBalance());

        sc.close();
    }
}