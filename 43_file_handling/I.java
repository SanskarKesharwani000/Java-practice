import java.io.File;
import java.io.IOException;

class I {
    public static void main(String[] args) {
        File file = new File("C:/Windows/System32/yamraj.mp4");

        try {
            boolean flag = file.createNewFile();

            System.out.println("File Created: " + flag);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


// java.io.IOException: Access is denied
//         at java.base/java.io.WinNTFileSystem.createFileExclusively(Native Method)
//         at java.base/java.io.File.createNewFile(File.java:1043)
//         at I.main(I.java:9)
