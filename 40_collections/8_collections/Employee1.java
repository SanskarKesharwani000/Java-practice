class Employee1 implements Comparable<Employee1> {
    String name;
    Integer age;
    
    Employee1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employee1 emp) {
        return name.compareTo(emp.name);
    }

    public String toString() {
        return name + "-" + age;
    }
}
