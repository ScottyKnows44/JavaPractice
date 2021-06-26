import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Runnable;
import java.lang.Thread;

public class RunnableExample implements Runnable{

    int count = 0;

    @Override
    public void run() {
        System.out.println("Thread is starting");

        try{
            while(count < 5){
                System.out.println("In Thread, count is "+ count);
                Thread.sleep(500);
                count++;
            }
        } catch (InterruptedException exc){
            System.out.println("Thread is interrupted");
        }
        System.out.println("Thread is exiting");
    }

    public static void main(String[] args) throws IOException {
        RunnableExample instance = new RunnableExample();
        Thread thread = new Thread(instance);
        thread.start();
        BufferedReader file = new BufferedReader(new FileReader("foo.txt"));
        String line;
        while((line = file.readLine()) != null){
            System.out.println(line);
        }
    }

}
