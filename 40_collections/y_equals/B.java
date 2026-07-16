class B {
    public static void main(String[] args) {
        Student s = new Student("Om", 21);
        Student t = new Student("Om", 21);
        Employee e = new Employee("Om", 21);

        System.out.println(s.equals(t));
        System.out.println(s.equals(e));
        System.out.println(s.equals(null));
    }
}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student) {
            Student s1 = this;
            Student s2 = (Student)obj;
    
            String nm1 = s1.name;
            String nm2 = s2.name;
    
            int ag1 = s1.age;
            int ag2 = s2.age;

            flag = nm1.equals(nm2) && ag1 == ag2;
        }

        return flag;
    }
}