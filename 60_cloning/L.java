class L {
    public static void main(String[] args) {
        Student x = new Student("vijay", 14);
                
        Student y = x.clone();

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

    @Override
    // protected Student clone() {
    public Student clone() {
        Student x = null;
        
        try {
            x = (Student)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return x;
    }
}
