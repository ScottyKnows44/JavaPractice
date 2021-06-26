import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        FizzBuzzBeforeJava8(50);
        FizzBuzzAfterJava8(50);
    }

    static void FizzBuzzBeforeJava8(int number){
        for(int i = 1; i <= number; i++ ){
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 5 == 0){
                System.out.println("Fizz");
            } else if( i % 7 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
    static void FizzBuzzAfterJava8(int num){
        // returns a sequential ordered IntStream from startInclusive to endInclusive by an incremental step of 1.
        // This includes both the startInclusive and endInclusive values.
        IntStream.rangeClosed(1,num)
                /* Checking each number and seeing if it is a mod of 5, if yes then checking to see if it is also a mod of 7
                 * If not a mod of 5 then it checks to see if it is a mod of 7.
                 * If not a mod of 7 or 5 then it just prints the number
                 */
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
