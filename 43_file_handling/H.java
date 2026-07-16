import java.io.File;
import java.io.IOException;

class H {
    public static void main(String[] args) {
        File file = new File("yamraj.pdf");

        try {
            boolean flag = file.createNewFile();

            System.out.println("File Created: " + flag);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
