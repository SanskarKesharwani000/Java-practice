class Q {
    static void pro(String name, int age, int... marks) {
        System.out.println("Name: " + name + " - Age: " + age);
    
        for(int next : marks)
            System.out.println(next);
    } 

    public static void main(String[] args) {
        pro("Gyan", 18, 89, 34, 56, 67, 90);
    }
}