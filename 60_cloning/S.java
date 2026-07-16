class User implements Cloneable {
    String name;
    int age;

    @Override
    public User clone() {
        User z = null;

        try {
            z = (User)super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return z;
    }
}

class Teacher extends User {
    int experience;
    float salary;
} 

class S {
    public static void main(String[] args) {
        Teacher x = new Teacher();

        x.name = "mukund";
        x.age = 32;
        x.experience = 12;
        x.salary = 30000;

        Teacher y = (Teacher)x.clone();

        System.out.println(x == y);
    }
}