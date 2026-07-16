class Student1 implements Comparable<Student1> {
    String name;
    Integer age;
    
    Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student1 s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return name + "-" + age;
    }
}
