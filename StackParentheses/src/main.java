import java.util.Stack;

public class main {
    public static void main(String[] args) {
        boolean  valid = validParentheses("{}");
        System.out.println(valid);
    }

    private static boolean validParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String[] array = s.split("");
        for (String x: array) {
            if(x.equals("{") || x.equals("(") || x.equals("[")){
                stack.add(x);
                continue;
            }
            if (stack.isEmpty()){
                return false;
            }

                String check;
                switch(x){
                    case "}":
                        check = stack.pop();
                       if(check.equals("(") || check.equals("[") ){
                           return false;
                       }
                       break;
                    case ")" :
                        check = stack.pop();
                        if(check.equals("{") || check.equals("[") ){
                            return false;
                        }
                        break;
                    case "]" :
                        check = stack.pop();
                        if(check.equals("{") || check.equals("(") ){
                            return false;
                        }
                        break;
                    default:
                        return false;
                }

        }
        return stack.isEmpty();
    }
}
