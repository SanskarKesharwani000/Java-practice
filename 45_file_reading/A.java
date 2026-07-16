import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class A {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("php.txt");

            System.out.println(fr.read());

            fr.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}


// java.io.FileNotFoundException: php.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at A.main(A.java:8)
