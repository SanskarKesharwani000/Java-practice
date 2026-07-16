import java.util.Arrays;

class A {
    public static void main(String[] args) {
        int[] x = {45, 23, 67, 12, 53, 34, 9};

        for(int next : x)
            System.out.print(next + " ");

        Arrays.sort(x);
        System.out.println();

        for(int next : x)
            System.out.print(next + " ");
    }
}