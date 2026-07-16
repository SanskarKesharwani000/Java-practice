class G {

    static void pro(String... x) {
        for(String next : x) {
            System.out.println(next);
        }
    }
    public static void main(String[] args) {
        pro("A", "B", "C", "D", "E");
        pro();
    }    
}
