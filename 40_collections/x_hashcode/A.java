class A {
    public static void main(String[] args) {
        Student s = new Student("mohan", 12);
        Student t = new Student("mohan", 12);
        Student u = new Student("noham", 12);
        Student v = new Student("ram", 12);

        //Case 3b:
        System.out.println(s.equals(v));
        System.out.println(s.hashCode());
        System.out.println(v.hashCode());

        //Case 3a:
        // System.out.println(s.equals(u));
        // System.out.println(s.hashCode());
        // System.out.println(u.hashCode());

        //Case 2:
        // System.out.println(s.equals(t));
        // System.out.println(s.hashCode());
        // System.out.println(t.hashCode());

        // Case 1:
        // for(int i=0;i<20;i++)
        //     System.out.println(s.hashCode());
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

            flag = nm1.equals(nm2);
        }

        return flag;
    }

    public int hashCode() {
        String abc = " abcdefghijklmnopqrstuvwxyz";
        int sum = 0;

        for(int i=0;i<name.length();i++)
            sum = sum + abc.indexOf(name.charAt(i));

        return sum;
    }
}