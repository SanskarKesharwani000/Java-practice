class Student1 implements Comparable<Student1> {
    String name;
    Integer age;

    Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public int compareTo(Student1 o) {
        return this.age.compareTo(o.age);
    }

    // public int compareTo(Student1 o) {
        // -old code
        // Student1 a = this;
        // Student1 b = (Student1)o;

        // String nm1 = a.name;
        // String nm2 = b.name;

        // return nm1.compareTo(nm2);

        // new code
        // return this.name.compareTo(o.name);
    // }

    public String toString() {
        return name + " - " + age;
    }
}
