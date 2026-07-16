class F {
    public static void main(String[] args) {
        Student2 x = new Student2("om", 12);

        // System.out.println(x.name + " --- " + x.age + " ---- " + x);
        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x);

        // x.name = "ram";
        x.setName("Jay");
        // x.age = 23;
        x.setAge(20);

        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x);
    }
}

// encapsulated mutable class
class Student2 {
    private String name;
    private int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
