import java.io.File;

class M {
    public static void main(String[] args) {
        File f1 = new File("Dharamraj.txt");

        File f2 = new File("Prithviraj.txt");

        boolean flag = f1.renameTo(f2);

        System.out.println("File Renamed: " + flag);
    }
}
