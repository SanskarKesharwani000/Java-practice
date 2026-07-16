// by inheritance we can use instance variable of F1 class same as of F class.

class F extends F1 {
    public static void main(String[] args) {
        F a = new F();

        System.out.println(a.y);  // Access Through Inheritance
    }
}

class F1 {
    int y = 45;
}
