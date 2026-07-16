import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class User {
    String name;

    User(String name) {
        this.name = name;
    }

    void process() {
        System.out.println("Hello " + name);
    }
}

class ZE {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Class<User> k = User.class;

        User u1 = new User("Jagdeep");
        User u2 = new User("Prabhanjan");
        User u3 = new User("Sukhbeer");
        
        // u1.process();
        // u2.process();
        // u3.process();

        Method m = k.getDeclaredMethods()[0];

        m.invoke(u3);
        m.invoke(u1);
        m.invoke(u2);
    }
}
