class Employee {
    String name;
    int age;
    
    // Employee(String name, int age) {        
    //     System.out.println(name + " ===== " + age);
    //     this.name = name;
    //     this.age = age;
    //     System.out.println(name + " ===== " + age);
    // }

    Employee(String name, int age) {        
        System.out.println(this.name + " ===== " + this.age);
        this.name = name;
        this.age = age;
        System.out.println(this.name + " ===== " + this.age);
    }
}
