class Bank{
    private double balance;
    public double getBalance(){ //getter
        return balance;
    }
    public Bank(double intialBalance){
        balance=intialBalance;
    }
    public void deposit(double amount){
        if(balance>0){
            balance+=amount;
        }

    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }else{
            System.out.println("invalid");
        }
    }
}
public class demo1{
    public static void main(String arff[]){
        Bank b1= new Bank(3000);
        System.out.println(b1.getBalance());
        b1.deposit(2000);
        System.out.println(b1.getBalance());
        b1.withdraw(1000);
        System.out.println(b1.getBalance());
    }
}