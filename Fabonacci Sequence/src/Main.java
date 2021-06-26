public class Main {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(FibonacciSequence(number));
    }

    /**
     * This method returns the number in the Fibonacci Sequence in the order of
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
     * Uses Recursion
     * @param n the place in the sequence you want to get
     * @return the number in the sequence you want to get
     */
    public static int FibonacciSequence(int n){
      if(n <= 1){
          return n;
      }
      return FibonacciSequence(n - 1) + FibonacciSequence(n - 2);
    }
}
