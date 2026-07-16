import java.io.Console;

class D {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");

        Console c = System.console();

        String name = c.readLine();

        System.out.println("My Name Is: " + name);
    }
}
