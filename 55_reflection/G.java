import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class User {
    String name;

    User(String name) {
        this.name = name;
    }

    void process(Float x, int y) {
        System.out.println("Hello " + name + " - " + x + " - " + y);
    }
}

class ZF {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Class<User> k = User.class;

        User u1 = new User("Jagdeep");
        User u2 = new User("Prabhanjan");
        User u3 = new User("Sukhbeer");
        
        // u1.process();
        // u2.process();
        // u3.process();

        Method m = k.getDeclaredMethods()[0];

        m.invoke(u3, 7.8f, 89);
        m.invoke(u1, 2.3f, 11);
        m.invoke(u2, 9.23f, 56);
    }
}
