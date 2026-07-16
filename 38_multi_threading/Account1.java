class Account1 {
    int balance = 50;
    
    void withdraw(int amt) {
        balance = balance - amt;
    }

    int getBalance() {
        return balance;
    }
}
