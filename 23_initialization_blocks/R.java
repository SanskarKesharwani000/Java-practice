class R {

    static {
        System.out.println("static block start");

        int y = 12/0;

        System.out.println("static block end");
    }

    public static void main(String[] args) {
        System.out.println("main start");
    }
}


// static block start
// Exception in thread "main" java.lang.ExceptionInInitializerError
// Caused by: java.lang.ArithmeticException: / by zero
//         at R.<clinit>(R.java:6)