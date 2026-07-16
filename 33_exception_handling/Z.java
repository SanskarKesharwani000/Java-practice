class Z {
    public static void main(String[] args) {
        LowBalanceException x = new LowBalanceException();

        throw x;
    }
}

class LowBalanceException extends RuntimeException {

}
