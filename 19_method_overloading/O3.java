class O3 {
    public static void main(String[] args) {
        Account x = new Account();
        x.balance = 1000;

        Account y = new Account();
        y.balance = 10000;

        System.out.println(x + y);
    }
}


// O3.java:9: error: bad operand types for binary operator '+'
//         System.out.println(x + y);
//                              ^
//   first type:  Account
//   second type: Account
// 1 error