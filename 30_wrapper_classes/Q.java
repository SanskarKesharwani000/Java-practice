class Q {
    public static void main(String[] args) {
        Double a = new Double(2.3);
        Double b = Double.valueOf(2.3);
        Double c = 2.3;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }    
}
