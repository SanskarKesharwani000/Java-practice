// input: 10000, 1000

class A1 {
    public static void main(String[] args) {
        int balance = Integer.parseInt(args[0]);    

        if(balance < 5000) {
            try {
                LowBalanceException x = new LowBalanceException("Balance is low...");
        
                throw x;
            } catch(LowBalanceException e) {
                System.out.println(e);
            }
        }

        System.out.println("---- after");
    }
}

class LowBalanceException extends RuntimeException {
    LowBalanceException() {

    }

    LowBalanceException(String msg) {
        super(msg);
    }
}