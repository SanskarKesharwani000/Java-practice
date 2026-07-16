import java.util.regex.*;
import java.util.Scanner;

class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone: ");
        String phone = sc.nextLine();

        sc.close();

        // Pattern p = Pattern.compile("[6-9][0-9]{9}");
        Pattern p = Pattern.compile("[6-9]\\d{9}");

        Matcher m = p.matcher(phone);

        if(m.matches()) {
            System.out.println(m.group() + " - " + m.start() + " - " + m.end());
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}