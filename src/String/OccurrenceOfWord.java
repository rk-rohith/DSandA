package String;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWord {
    public static void main(String[] args) {
        String str = "the word is not a word but it is a word";
        String[] strArray = str.split(" ");
        Map<String,Integer> strMap = new HashMap<>();
        for(String s: strArray){
            if(!strMap.containsKey(s)){
                strMap.put(s,1);
            }else{
                strMap.put(s,strMap.get(s)+1);
            }
        }
        System.out.println(strMap);
    }
}
