class Account2 {
    int balance = 50;
    
    void withdraw(int amt) {
        if(balance >= amt) {
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();}
            balance = balance - amt;
        }
    }

    int getBalance() {
        return balance;
    }
}
