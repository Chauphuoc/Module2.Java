package refactoring;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapJames {
    public static void main(String[] args) {
        String str1 = "Hom qua qua noi ma qua";
        String [] arr = str1.split(" ");
        Map<String,Integer> map = new TreeMap<>();
        for (String s : arr){
          if (map.containsKey(s)){
              int value = map.get(s);
              value++;
              map.replace(s,value);
          }
          else map.put(s,1);
        }
        System.out.println(map.toString());

    }
}
