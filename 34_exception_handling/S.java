class S {
    public static void main(String[] args) {
        int x = pro();

        System.out.println(x);
    }   
    
    static int pro() {
        try {
            return 100;
        } finally {
            return 200;
        }
    }
}
