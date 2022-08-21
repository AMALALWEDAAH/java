public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount BankAccount1 =new BankAccount();

        BankAccount1.deposit("checking",20.0);
        BankAccount1.deposit("saving",20.0);
        BankAccount1.deposit("a",10.0);

        System.out.println("checkingBalance:"+BankAccount1.getCheckingBalance());
        System.out.println("savingsBalance:"+BankAccount1.getSavingsBalance());

        BankAccount1.withdraw(10.0);
        
        System.out.println("total: $"+BankAccount.totalAmount);
        
        BankAccount1.displayTotal();

        BankAccount BankAccount2 =new BankAccount();
        BankAccount2.deposit("saving",10.5);
        System.out.println("checkingBalance:"+BankAccount2.getCheckingBalance());
        System.out.println("savingsBalance:"+BankAccount2.getSavingsBalance());
        System.out.println(BankAccount.totalAmount);

        System.out.println("numberOfAccounts:"+BankAccount.numberOfAccounts);
    }
}

