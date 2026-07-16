import java.io.File;

class E {
    public static void main(String[] args) {
        File file = new File("C:\NEW\javaprac\43_file_handling");

        System.out.println(file.exists());
    }
}


// E.java:5: error: illegal escape character
//         File file = new File("C:\NEW\javaprac\43_file_handling");
//                                  ^
// E.java:5: error: illegal escape character
//         File file = new File("C:\NEW\javaprac\43_file_handling");
//                                      ^
// 2 errors