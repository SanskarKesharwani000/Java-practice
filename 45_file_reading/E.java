import java.io.FileReader;
import java.io.IOException;

class E {
    public static void main(String[] args) throws IOException {    
        FileReader fr = new FileReader("java.txt");

        char[] arr = new char[100];

        int count = fr.read(arr);
        for(int i=0;i<count;i++)
            System.out.print(arr[i]);

        System.out.println("\n"+count);

        count = fr.read(arr);
        for(int i=0;i<count;i++)
            System.out.print(arr[i]);

        System.out.println("\n"+count);

        count = fr.read(arr);
        for(int i=0;i<count;i++)
            System.out.print(arr[i]);

        System.out.println("\n"+count);

        count = fr.read(arr);
        for(int i=0;i<count;i++)
            System.out.print(arr[i]);

        System.out.println("\n"+count);
        
        count = fr.read(arr);
        for(int i=0;i<count;i++)
            System.out.print(arr[i]);
        
        System.out.println("\n"+count);
        
        count = fr.read(arr);
        for(int i=0;i<count;i++)
            System.out.print(arr[i]);
        
        System.out.println("\n"+count);
        
        fr.close();
    }    
}
