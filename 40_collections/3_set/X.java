class X {
    public static void main(String[] args) {
        String a = new String("ram");
        String b = new String("ram");
        String c = new String("rom");

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(c.compareTo(a));
    }    
}
