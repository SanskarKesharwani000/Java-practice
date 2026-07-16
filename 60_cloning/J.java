class J {
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
    Student clone() {
        Student x = null;
        
        try {
            x = (Student)clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return x;
    }
}


// J.java:29: error: clone() in Student cannot override clone() in Object
//     Student clone() {
//             ^
//   attempting to assign weaker access privileges; was protected
// 1 error