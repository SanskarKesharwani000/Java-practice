// we can access static variable of another class with their class name

class E {
    public static void main(String[] args) {
        System.out.println(E1.y);
    }
}

class E1 {
    static int y = 56;
}
