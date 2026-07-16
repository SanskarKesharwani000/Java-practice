class L2 {
    public static void main(String[] args) {
        Student5 x = new Student5("Yamraj", 1000, "MTech", 78.45f);

        Employee3 y = new Employee3("Indradev", 1, 56000, "SE");

        System.out.println(x.name + " =---- " + x.age + " ------- " + x.degree + "------- " + x.marks);
        System.out.println(y.name + " =---- " + y.age + "-------- " + y.salary + "------- " + y.designation);
    }    
}
