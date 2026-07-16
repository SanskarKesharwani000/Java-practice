class Student1 implements Comparable {
    String name;
    Integer age;
    
    Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + "-" + age;
    }

    public int compareTo(Object obj) {
        Student1 a = this;
        Student1 b = (Student1)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.compareTo(nm2);
    }
}
