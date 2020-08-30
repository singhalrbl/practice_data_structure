package app;

public class Bankaccount {

    public Double balance=0.0;

    public Bankaccount(Double openingBalance) {
        balance = balance + openingBalance;
    }

    public void deposit(Double amount) {
        balance = balance + amount;
    }

    public void withdrwal(Integer amount) {

        balance = balance - amount;

    }

    public static void main(String[] args) {
        
            Bankaccount object = new Bankaccount(100.00);
            object.deposit(74.20);
            System.out.println("Balance after deposit "+ object.balance);
            object.withdrwal(20);
            System.out.println("Balance after withdrwal "+ object.balance);

    }
}