class Bank_account{

    String name ;
    int accnum;
    double balance;

    void assignvalues(){
        name = Yeshwanth;
        accnum = 101;
        balance = 5000;
    }
    void deposit(){
        balance = balance + 1500;

    }
    void withdraw(){
        balance = balance - 3000;

    }
    void display(){
        System.out.println("Name ="+name);
        System.out.println("Account Number = "+accnum);
        System.out.println("Balance = "+balance);
    }
    public static void main(String[] args){
        Bank_account b = new Bank_account();
        b.assignvalues();
        b.deposit();
        b.withdraw();
        b.display();
    
    }
}