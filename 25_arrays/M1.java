import java.util.Scanner;

class M1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] y = new String[2][3];

        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print("("+ i + "," + j + ") ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
