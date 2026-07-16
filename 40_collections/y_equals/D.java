class D {
    public static void main(String[] args) {
        Student s = new Student("Om", 21);
        Student t = new Student("Om", 21);
        Student u = new Student("Om", 21);
        Student v = new Student("Om", 20);

        // It is reflexive:
        // System.out.println(s.equals(s));
        // System.out.println(t.equals(t));

        // It is symmetric:
        // System.out.println(s.equals(t));
        // System.out.println(t.equals(s));

        // It is transitive:
        // System.out.println(s.equals(t));
        // System.out.println(t.equals(u));
        // System.out.println(s.equals(u));
    
        // It is consistent:
        // for(int i=0;i<50;i++)
        //     // System.out.println(s.equals(t));
        //     System.out.println(s.equals(v));

        // null test:
        System.out.println(s.equals(null));
        System.out.println(t.equals(null));
        System.out.println(v.equals(null));
        System.out.println(u.equals(null));
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