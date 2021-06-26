import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintFooFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Foo.txt"));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}
