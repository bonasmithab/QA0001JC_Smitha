package d30JavaPractice;

public class C08_BankAccountRunner {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        C08_BankAccount myAccount = new C08_BankAccount();

        // Set account number and initial balance
        myAccount.setAccountNumber("123456789");
        myAccount.setBalance(1000.0);

        // Test deposit method
        myAccount.deposit(500.0); // Expected: balance = 1500.0
        System.out.println("Current Balance: " + myAccount.getBalance());

        // Test withdraw method
        myAccount.withdraw(200.0); // Expected: balance = 1300.0
        System.out.println("Current Balance: " + myAccount.getBalance());

        // Test insufficient funds
        myAccount.withdraw(2000.0); // Expected: error message, balance = 1300.0
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}

