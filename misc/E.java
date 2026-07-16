import java.io.Console;

class E {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.print("Enter your age: ");
        String tmp = c.readLine();

        int age = Integer.parseInt(tmp);

        System.out.println("My Age Is: " + age);
    }
}
