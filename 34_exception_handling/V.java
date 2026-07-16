class V {
    public static void main(String[] args) {
        try {
            int y = 12 / 0;
        } catch(ArithmeticException e) {
            throw new NullPointerException();
        } finally {
            throw new ClassCastException();
        }
    }    
}


// Exception in thread "main" java.lang.ClassCastException
//         at V.main(V.java:8)
