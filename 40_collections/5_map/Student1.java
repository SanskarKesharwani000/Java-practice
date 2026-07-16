class Student1 {
    String name;
    int age;
    
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "("+name + "-" + age+")";
    }

    public boolean equals(Object obj) {
        boolean flag = false;

        if(obj instanceof Student1) {
            Student1 a = this;
            Student1 b = (Student1)obj;

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
        }

        return flag;
    }

    public int hashCode() {
        int sum = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i=0;i<name.length();i++) {
            sum += abc.indexOf(name.charAt(i));
        }

        return sum;
    }
}
