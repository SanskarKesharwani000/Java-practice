import java.util.Arrays;

class I {
    public static void main(String[] args) {
        User1[] x = {
                        new User1("golu", 12),
                        new User1("vikram", 9),
                        new User1("sudeep", 5),
                        new User1("pradeep", 10),
                        new User1("gurdeep", 7)
                    };

        for(User1 next : x)
            System.out.print(next + " ");

        Arrays.sort(x);
        System.out.println("\n");

        for(User1 next : x)
            System.out.print(next + " ");

        System.out.println("\n");
        // User1 t = new User1("sudeep", 5);
        User1 t = new User1("mandeep", 15);
        System.out.println(Arrays.binarySearch(x, t));
    }
}
