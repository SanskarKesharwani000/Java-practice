class Student3 implements Comparable {
    String name;
    Integer age;
    
    Student3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // public int compareTo(Object obj) {
    //     Student3 a = this;
    //     Student3 b = (Student3)obj;
        
    //     String nm1 = a.name;
    //     String nm2 = b.name;

    //     return nm1.compareTo(nm2);
    // }
    public int compareTo(Object obj) {
        Student3 a = this;
        Student3 b = (Student3)obj;
        
        Integer ag1 = a.age;
        Integer ag2 = b.age;

        return ag1.compareTo(ag2);
    }

    public String toString() {
        return name + " ~ " + age;
    }
}
