import java.io.File;

class N {
    public static void main(String[] args) {
        File f1 = new File("JAVA");

        System.out.println("File Name Before: " + f1);

        File f2 = new File("SPRINGBOOT");

        boolean flag = f1.renameTo(f2);

        System.out.println("File Renamed: " + flag);
        System.out.println("File Name After: " + f1);
    }
}
