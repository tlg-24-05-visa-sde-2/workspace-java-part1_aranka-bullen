class Account {
    //attributes
    String accountType;  //constraints [savings, checking]
    int accountNumber;
    double balance;

    //constructor
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //getter and setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

   private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        //toDO: randomize accountNumber

    }




    //methods & functions
    private static void deposit(double amountDeposit){
        double balance  =+ amountDeposit;
        System.out.printf("%s has been deposited to your account", amountDeposit);


    }
}