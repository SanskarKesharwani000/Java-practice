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

class R {
    public static void main(String[] args) {
        Teacher x = new Teacher();

        x.name = "mukund";
        x.age = 32;
        x.experience = 12;
        x.salary = 30000;

        Teacher y = x.clone();
    }
}


// R.java:33: error: incompatible types: User cannot be converted to Teacher
//         Teacher y = x.clone();
//                            ^
// 1 error
