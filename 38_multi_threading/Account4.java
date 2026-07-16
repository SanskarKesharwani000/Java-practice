class Account4 {
    private int balance = 50;
    
    synchronized void withdraw(int amt) {
        balance = balance - amt;        
    }

    synchronized int getBalance() {
        return balance;
    }
}
