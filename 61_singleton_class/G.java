class G {
    public static void main(String[] args) {
        G a = new G();
        G b = new G();
        G c = new G();

        System.out.println(a == b);
        System.out.println(c == b);
        System.out.println(c == a);
    }    
}
