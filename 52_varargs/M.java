class M {
    static void pro(String name, int... marks) {
        System.out.println(name);

        for(int next : marks)
            System.out.println(next);
    }

    public static void main(String[] args) {
        pro("Gopal", 67, 78, 56, 98);
    }    
}
