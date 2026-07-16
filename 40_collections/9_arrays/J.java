import java.util.Arrays;
import java.util.Comparator;

class J {
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

        System.out.println("\n");
        Comparator<User> comp = new AgeAscSort();
        // Comparator<User> comp = new NameAscSort();
        Arrays.sort(x, comp);

        for(User next : x)
            System.out.print(next + " ");
        
        System.out.println("\n");
        // User t = new User("pradeep", 12);
        User t = new User("balveer",8);
        System.out.println(Arrays.binarySearch(x, t, comp));
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