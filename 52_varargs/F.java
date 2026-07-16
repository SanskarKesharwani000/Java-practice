class F {

    static void pro(String... x) {
        System.out.println(x.length);
    }
    public static void main(String[] args) {
        pro("A", "B", "C");
        pro("A", "B");
        pro("A");
        pro();
        pro(new String[] {"A", "B", "C", "D", "E"});
    }    
}
