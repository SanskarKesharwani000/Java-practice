class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student2) {
            Student2 s1 = this;
            Student2 s2 = (Student2)obj;

            String nm1 = s1.name;
            String nm2 = s2.name;

            int ag1 = s1.age;
            int ag2 = s2.age;

            flag = nm1.equals(nm2) && ag1 == ag2;
        }

        return flag;
    }

    public int hashCode() {
        String abc = " abcdefghijklmnopqrstuvwxyz";
        int sum = 0;

        for(int i=0;i<name.length();i++)
            sum = sum + abc.indexOf(name.charAt(i));

        sum += age;

        return sum;
    }

    public String toString() {
        return name + " - " + age;
    }
}