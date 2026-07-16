// A class cannot be accessed outside that file if it's name is not same as file name

public class Z {
    public static void main(String[] args) {
        X a = new X();

        System.out.println(a.a);
    }
}
