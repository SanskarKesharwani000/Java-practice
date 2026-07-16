class Z2 {
    public static void main(String[] args) {
        LowBalanceException x = new LowBalanceException("Balance is low...");

        throw x;
    }
}

class LowBalanceException extends RuntimeException {
    LowBalanceException() {

    }

    LowBalanceException(String msg) {
        super(msg);
    }
}