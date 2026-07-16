// An instance variable is ok if it is not initialized at declaration

class M {
    int x;
    int y = 9;
    
    public static void main(String[] args) {
        M a = new M();

        System.out.println(a.x);
        System.out.println(a.y);
    }
}
