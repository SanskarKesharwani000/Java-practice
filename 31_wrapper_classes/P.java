class P {
    public static void main(String[] args) {
        Integer x = 34;

        int a = x;  //unboxing: auto...
        int b = x.intValue(); // unboxing: manual...

        System.out.println(a);
        System.out.println(b);
    }    
}
