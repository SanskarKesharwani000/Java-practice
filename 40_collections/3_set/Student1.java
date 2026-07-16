class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        Student1 a = this;
        Student1 b = (Student1)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        int ag1 = a.age;
        int ag2 = b.age;

        return nm1.equals(nm2) && ag1 == ag2;
    }

    public String toString() {
        return name + " - " + age;
    }
}