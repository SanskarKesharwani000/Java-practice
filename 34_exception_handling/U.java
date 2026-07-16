class U {
    public static void main(String[] args) {
        try {
            System.out.println("some code... " + args[0]);
        } catch(ArrayIndexOutOfBoundsException w) {
            // rethrowing an exception...
            throw w;
        }
    }   
}
