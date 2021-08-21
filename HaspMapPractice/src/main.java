import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("text.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        Collection<Integer> collection = map.values();
        while(scanner.hasNext()){
            String word  = scanner.next();
            if(word.charAt(word.length()-1) == ',' || word.charAt(word.length()-1) == '.'){
                word = word.substring(0, word.length()-1);
            }

            if(!map.containsKey(word)){
                map.put(word, 1);
            } else {
                int value = map.get(word);
                map.put(word, value+1);
            }
        }
        System.out.println("Before remove");
        printWholeMap(map);
        removeKeyFromMap(map, "sed");
        System.out.println("After Remove");
        printWholeMap(map);
    }

    private static void removeKeyFromMap(HashMap<String, Integer> map, String entry) {
        map.remove(entry);
    }

    private static void printCollection(Collection<Integer> collection) {
        System.out.println("Printing out whole collection");
        for ( Integer num: collection) {
            System.out.println(num);
        }
    }

    public static void printWholeMap(HashMap<String,Integer> map){
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
