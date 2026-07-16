class I {
    public static void main(String[] args) {
        Student x = new Student("vijay", 14);
                
        Student y = x.createClone();

        System.out.println(x == y);

        // --------

        System.out.println(x.name);

        y.name = "arijit";

        System.out.println(x.name);
    }    
}

class Student implements Cloneable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student createClone() {
        Student x = null;
        
        try {
            x = (Student)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return x;
    }
}
