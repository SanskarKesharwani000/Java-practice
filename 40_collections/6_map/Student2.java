class Student2 implements Comparable<Student2> {
    String name;
    Integer age;
    
    Student2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Student2 obj) {
        return age.compareTo(obj.age);
    }
}
