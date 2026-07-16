import java.util.Scanner;

class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[4];
        
        // System.out.println(x[0]);
        // System.out.println(x[1]);
        // System.out.println(x[2]);
        // System.out.println(x[3]);

        for(int i = 0; i < x.length; i++)
            System.out.println("~" + x[i]);
        
        System.out.println("++++++++++++++++++++++++");

        // x[0] = 90;
        // x[1] = 80;
        // x[2] = 20;
        // x[3] = 30;
        for(int i = 0; i < x.length; i++) {
            System.out.print("Enter a value for index " + i);
            x[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("++++++++++++++++++++++++");

        // System.out.println(x[0]);
        // System.out.println(x[1]);
        // System.out.println(x[2]);
        // System.out.println(x[3]);
        for(int i = 0; i < x.length; i++)
            System.out.println("- "+x[i]);
    }    
}
