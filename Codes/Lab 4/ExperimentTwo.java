/*Create a BankAccount class with a private variable balance to store the account balance. Implement a 
public method deposit(double amount) to add funds, a protected method withdraw(double amount) to deduct funds, 
and a default-access method checkBalance() to display the current balance. Create an object of the class and
 demonstrate which methods and variables can be accessed both inside and outside the class.  */

class BankAccount{
    private double _accountBalance = 0;

    void deposit(double amount){
        this._accountBalance += amount;
    }

    protected void withdraw(double amount){
        this._accountBalance -= amount;
    }

    void checkBalance(){
        System.out.println(this._accountBalance);
    }
}
public class ExperimentTwo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(50000.00);
        ba.withdraw(30000.00);

        ba.checkBalance();
        
    }
}
