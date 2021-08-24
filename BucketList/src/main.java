import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class main {

    public static void main(String[] args) {
        HashMap<int[], ArrayList<Integer>> map = new HashMap<>();
        int[] list = {1,3,5,9,6,9,10,12,16,17,18,20,30,25,30,40,31,32,49,50,44 };
        putIntoBuckets(map, list);
    }

    private static void putIntoBuckets(HashMap<int[], ArrayList<Integer>> map, int[] list)
    {

        int highestNum = 0;
        for (int j : list) {
            if (j > highestNum) highestNum = j;
        }
        addBucketKeys(map, 1, highestNum);
        addBucketValues(map, list);
        map.forEach((k, v) -> {
            System.out.println("key: ["+ k[0]+ ", "+ k[1]+ "] value: "+ v );
        });

    }

    private static void addBucketValues(HashMap<int[], ArrayList<Integer>> map, int[] list) {
        for(int i=0; i< list.length; i++){
            int finalI = i;
            map.forEach((k, v) -> {
                if(list[finalI]>= k[0] && list[finalI] <= k[1] ){
                    ArrayList<Integer> arrayList;
                    arrayList = Objects.requireNonNullElseGet(v, ArrayList::new);
                    arrayList.add(list[finalI]);
                    map.put(k, arrayList);
                }
            });
        }

    }

    private static void addBucketKeys(HashMap<int[], ArrayList<Integer>> map, int v, int maxIndex)
    {

        for(int i = v; i<=maxIndex; i+=5){
            map.put(new int[] { i , (i+4) }, null);
        }
    }
}
