public class main {
    public static void main(String[] args) {
        createTree(5);
    }

    public static void createTree(int number){

        if(number == 0){
            System.out.println("");
        } else if(number == 1){
            System.out.println("*");
        }

        String string = "*";

        for (int i = 1; i <= number; i++ ){
            System.out.println(string);
            string += "**";
        }
    }
}
