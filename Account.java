class Account{
    private int balance;

    void setBalance(int b){
        balance=b;
    }
    void printBalance(){
        System.out.println("The Balance is :"+balance);
    }
}

class AccountDemo{
    public static void main(String ar[]){
        Account a1=new Account();
      //  a1.balance=100;
      a1.setBalance(200);
        a1.printBalance();
    }
}