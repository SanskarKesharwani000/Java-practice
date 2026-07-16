class P {
    public static void main(String[] args) {
        Boolean a = new Boolean(true);
        Boolean b = Boolean.valueOf(true);
        Boolean c = true;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }    
}
