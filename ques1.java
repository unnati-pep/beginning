public class ques1{
    public static void main(String[] args){
        BankAccount account=new BankAccount(100);
        Runnable depositTask=()->{
            for(int i=0;i<5;i++)
            account.deposit(100);
        };
        Runnable withdrawTask=()->{
            for(int i=0;i<5;i++)
            account.withdraw(150);
        };
        Thread t1=new Thread(depositTask,"Deposit Thread");
        Thread t2=new Thread(withdrawTask,"Withdraw Thread");
        t1.start();
        t2.start();
    }
}