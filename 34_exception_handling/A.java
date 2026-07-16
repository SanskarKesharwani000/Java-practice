class A {
    public static void main(String[] args) {
        int balance = 4999;    
        // int balance = 5000;    


        if(balance < 5000) {
            LowBalanceException x = new LowBalanceException("Balance is low...");
    
            throw x;
        }

        System.out.println("---- end");
    }
}

class LowBalanceException extends RuntimeException {
    LowBalanceException() {

    }

    LowBalanceException(String msg) {
        super(msg);
    }
}