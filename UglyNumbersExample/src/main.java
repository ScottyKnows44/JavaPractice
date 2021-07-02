import java.util.TreeSet;

public class main {
    public static long getUglyNumbers(int number){
        TreeSet<Long> t = new TreeSet<>();

        t.add(1L);

        int i = 1;

        while(i<number){
            long temp = t.pollFirst();
            t.add(temp * 2);
            t.add(temp * 3);
            t.add(temp * 5);
            i++;
        }
        return t.pollFirst();
    }
    public static void main(String[] args) {
        int i = 50;
        System.out.println("Number of ugly numbers are " + getUglyNumbers(i));
    }
}
