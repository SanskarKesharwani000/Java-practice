import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }
}

class ZB {
    public static void main(String[] args) {
        // Employee a1 = new Employee();
        try {
            Employee a1 = (Employee)(Employee.class.getDeclaredConstructors()[0].newInstance("Yamraj"));

            System.out.println(a1.name);
        } catch(InstantiationException e) {
            e.printStackTrace();
        } catch(InvocationTargetException e) {
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
