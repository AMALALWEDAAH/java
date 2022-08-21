public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double totalAmount = 0;

    public BankAccount(){
        checkingBalance=checkingBalance;
        savingsBalance=savingsBalance;
        numberOfAccounts+=1;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double deposit (String type ,double amount){
        if(type=="checking"){
            checkingBalance+=amount;
        }else if(type=="saving"){
            savingsBalance+=amount;
        }else{
            System.out.println("Select a valid method!!");
        }
        
        return totalAmount+=amount;
    }

    public double withdraw(double amount){
        if(checkingBalance >= amount){
            checkingBalance=(checkingBalance-amount);
            totalAmount=(amount;
        }else if(savingsBalance >= amount){
            savingsBalance-=amount;
            totalAmount-=amount;
        }
        else{
            System.out.println("you are broke :)");
        }
        System.out.println("withdraw: $"+amount);
        return totalAmount;
    }

    public double displayTotal(){
        System.out.println("your checkingBalance:"+checkingBalance+"\nyour savingsBalance:"+savingsBalance);
        return checkingBalance;
    }
}