import java.lang.reflect.Field;

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }
}


class Z1  {
    public static void main(String[] args) throws IllegalAccessException {
        Student a1 = new Student("gopal");
        Student a2 = new Student("sarvan");
        Student a3 = new Student("surya");

        Field f = Student.class.getDeclaredFields()[0];

        f.setAccessible(true);
        System.out.println(f.get(a2));
        System.out.println(f.get(a1));
        System.out.println(f.get(a3));

        // System.out.println(a2.name);
    }    
}
