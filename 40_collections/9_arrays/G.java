import java.util.Arrays;

class G {
    public static void main(String[] args) {
        int[] x = {45, 23, 67, 12, 53, 34, 9};

        for(int next : x)
            System.out.print(next + " ");

        System.out.println("\n");

        System.out.println(Arrays.binarySearch(x, 53));
    }
}
