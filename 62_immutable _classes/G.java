class G {
    public static void main(String[] args) {
        Student3 x = new Student3("om", 12);

        // System.out.println(x.name + " --- " + x.age + " ---- " + x);
        System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x);

        // x.name = "ram";
        // x.setName("Jay");
        // x.age = 23;
        // x.setAge(20);

        // System.out.println(x.getName() + " --- " + x.getAge() + " ---- " + x);
    }
}

// encapsulated immutable class
final class Student3 {
    private final String name;
    private final int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }
}
