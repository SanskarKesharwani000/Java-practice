import java.io.File;

class G1 {
    public static void main(String[] args) {
        File file = new File("A.java");
        // File file = new File("Y.java");

        System.out.println("File Path: " + file);

        String absPath = file.getAbsolutePath();
        System.out.println("Absolute File Path: " + absPath);
    }
}
