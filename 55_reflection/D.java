import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee {
    String name;
    int age;
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ZC {
    public static void main(String[] args) {
        // Employee a1 = new Employee();
        try {
            Employee a1 = (Employee)(Employee.class.getDeclaredConstructors()[0].newInstance("Yamraj", 10000));

            System.out.println(a1.name);
            System.out.println(a1.age);
        } catch(InstantiationException e) {
            e.printStackTrace();
        } catch(InvocationTargetException e) {
            e.printStackTrace();
        } catch(IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
