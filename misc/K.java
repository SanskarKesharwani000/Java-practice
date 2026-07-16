class K {
    public static void main(String[] args) {
        Student x = new Student("dheerendra", 25);

        System.out.println(x);
        System.out.println(x.toString());
    }    
}

class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public String toString() {
    //     return name + " - " + age;
    // }
}
