import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee {
    String name;    
}

class ZA {
    public static void main(String[] args) {
        // Employee a1 = new Employee();
        try {
            Employee a1 = (Employee)(Employee.class.getDeclaredConstructors()[0].newInstance());

            System.out.println(a1);
        } catch(InstantiationException e) {
            e.printStackTrace();
        } catch(InvocationTargetException e) {
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
