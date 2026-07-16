class User1 implements Comparable<User1> {
    String name;
    Integer age;
    
    User1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(User1 u) {
        return name.compareTo(u.name);
    }

    public String toString() {
        return name + "-" + age;
    }
}
