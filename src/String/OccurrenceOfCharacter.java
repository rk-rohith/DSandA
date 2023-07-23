/***
This program is used to check the occurrence of each character
*/
package String;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String str = "RohtangLa";
        char[] ch = str.toLowerCase().toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : ch) {
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }
        System.out.println(charMap);

        /* Remove Duplicates*/
        for (Map.Entry<Character, Integer> entries : charMap.entrySet()) {
            if (entries.getValue() == 1) {
                System.out.println(entries.getKey());
            }
        }

    }
}
