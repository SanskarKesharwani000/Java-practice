import java.util.Arrays;

class D {
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
        Arrays.sort(x);

        for(User next : x)
            System.out.print(next + " ");
    }
}



// Exception in thread "main" java.lang.ClassCastException: class User cannot be cast to class java.lang.Comparable (User is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1041)
//         at D.main(D.java:16)