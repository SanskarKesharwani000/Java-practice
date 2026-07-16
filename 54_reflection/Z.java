import java.lang.reflect.Field;

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }
}


class Z  {
    public static void main(String[] args) throws IllegalAccessException {
        Student a1 = new Student("gopal");
        Student a2 = new Student("sarvan");
        Student a3 = new Student("surya");

        Field f = Student.class.getDeclaredFields()[0];

        System.out.println(f.get(a2));
    }    
}



// Exception in thread "main" java.lang.IllegalAccessException: class Z cannot access a member of class Student with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Field.checkAccess(Field.java:1102)
//         at java.base/java.lang.reflect.Field.get(Field.java:423)
//         at Z.main(Z.java:20)