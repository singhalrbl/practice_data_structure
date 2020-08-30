package revision_30may2020;

public class RBankAccount {

    public Integer balance;

    public RBankAccount(int openingBanlance){
        balance = openingBanlance;
    }

    public int displayCurrentBalance(){

        return balance;

    }

    public void withdrwal(int withdrawlAmount){

        if(withdrawlAmount < balance)
        {
            balance = balance - withdrawlAmount;
        }
        else{
            System.out.println("Insuffeicent balance");
        }

    }

    public void deposit(int amountDeposited){

        balance = balance + amountDeposited;

    }


    
}

class BankApp{

    public static void main(String[] args) {
        

        RBankAccount account = new RBankAccount(100);
        System.out.println("Display current Balance "+account.displayCurrentBalance());

        account.withdrwal(50);
        System.out.println("Display current Balance "+account.displayCurrentBalance());

        account.deposit(200);
        System.out.println("Display current Balance "+account.displayCurrentBalance());


    }

}