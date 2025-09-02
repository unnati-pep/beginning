public class BankAccount{
    private double balance;
    //constructor
    public BankAccount(double bal){
        this.balance=bal;
    }
    public synchronized void deposit(double amt){
        balance+=amt;
        System.out.println(Thread.currentThread().getName()+" deposited: "+amt+". Balance: "+balance);
    }
    public synchronized void withdraw(double amt){
        if(balance>=amt){
            balance-=amt;
            System.out.println(Thread.currentThread().getName()+" withdrew: "+amt+". Balance: "+balance);
        }
        else{
            System.out.println("Not enough balance for"+Thread.currentThread().getName());
        }
    }
    public double getBalance(){
        return balance;
    }
}