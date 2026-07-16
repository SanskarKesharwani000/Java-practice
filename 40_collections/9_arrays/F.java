import java.util.Arrays;
import java.util.Comparator;

class F {
    public static void main(String[] args) {
        User[] x = {
                        new User("golu", 12),
                        new User("vikram", 9),
                        new User("sudeep", 5),
                        new User("pradeep", 10),
                        new User("gurdeep", 7)
                    };

        for(User next : x)
            System.out.print(next + " ");

        System.out.println();
        // Arrays.sort(x, new NameAscSort());
        Arrays.sort(x, new AgeAscSort());

        for(User next : x)
            System.out.print(next + " ");
    }
}


class NameAscSort implements Comparator<User> {
    public int compare(User u1, User u2) {
        return u1.name.compareTo(u2.name);
    }
}

class AgeAscSort implements Comparator<User> {
    public int compare(User u1, User u2) {
        return u1.age.compareTo(u2.age);
    }
}