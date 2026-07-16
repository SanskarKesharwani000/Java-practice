import java.util.Arrays;

class B {
    public static void main(String[] args) {
        char[] x = {'f','A','9','J','t','K','7'};

        for(char next : x)
            System.out.print(next + " ");

        Arrays.sort(x);
        System.out.println();

        for(char next : x)
            System.out.print(next + " ");
    }
}