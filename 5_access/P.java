// by inheritance we can use instance variable of F1 class same as of F class.

class P extends P1 {
    int y = 34;
    public static void main(String[] args) {
        P a = new P();

        System.out.println(a.y);  // Access Through Inheritance
        a.pro();
    }
    public void pro(){
        System.out.println(super.y);
    }
}

class P1 {
    int y = 45;
}
