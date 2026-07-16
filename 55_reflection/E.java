import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee {
    String name;
    int age;
    
    private Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ZD {
    public static void main(String[] args) {
        // Employee a1 = new Employee();
        try {
            Constructor c = Employee.class.getDeclaredConstructors()[0];
            
            c.setAccessible(true);
            Employee a1 = (Employee)(c.newInstance("Raja Indraverma", 35));

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
