class BankAccount {
    public String accountHolderName;   //public
    private int  atmpin;               //private
    protected double balance;         // protected
    
    // constructor
    BankAccount(String name, int pin,double bal){
        accountHolderName = name;
        atmpin = pin;
        balance= bal;
    }
    
    //public method to access private data
    public void showBalance(int pin){
        if (atmpin ==pin){
            System.out.println("balance is: " + balance);
        }else{
            System.out.println("Worng PIN");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	   BankAccount acc = new BankAccount("Vishal",1234,50000);
		System.out.println(acc.accountHolderName);
		acc.showBalance(11234);
	}
}







