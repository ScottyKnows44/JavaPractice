import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stack {
    public static void main(String[] args) throws IOException {
        java.util.Stack<String> stack = new java.util.Stack<>();
        BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
        String line;
        while ((line = br.readLine()) != null){
            stack.push(line);
        }
        stack = sortStack(stack);
        printStack(stack);
    }
    public static void printStack(java.util.Stack<String> stack){
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static java.util.Stack<String> sortStack(java.util.Stack<String> stack){
        java.util.Stack<String> newStack = new java.util.Stack<>();

        while(!stack.isEmpty()){
            String tmp = stack.pop();
            while(!newStack.isEmpty() && newStack.peek().compareTo(tmp) < 0){
                stack.push(newStack.pop());
            }
            newStack.push(tmp);
        }
        return newStack;
    }
}
