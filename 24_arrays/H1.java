class H1 {
    public static void main(String[] args) {
        char[] y = new char[3];

        System.out.println((int)y[0]);
        System.out.println((int)y[1]);
        System.out.println((int)y[2]);
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println(">"+'\u0000'+"<");
        System.out.println((int)'\u0000');
    }    
}
