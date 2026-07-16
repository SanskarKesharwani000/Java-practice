class K {
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
            x = (Student)clone();  // recursive function call
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return x;
    }
}


// Exception in thread "main" java.lang.StackOverflowError
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)
//         at Student.clone(K.java:34)