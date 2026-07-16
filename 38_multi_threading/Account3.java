class Account3 {
    private int balance = 50;
    
    synchronized void withdraw(int amt) {
        if(balance >= amt) {
            try { Thread.sleep(500); } catch(InterruptedException e) { e.printStackTrace();}
            balance = balance - amt;
        }
    }

    synchronized int getBalance() {
        return balance;
    }
}
