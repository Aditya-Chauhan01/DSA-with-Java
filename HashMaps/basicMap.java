package HashMaps;

import java.util.HashMap;

public class basicMap {
    public static void main(String[] args) {    // insertion, deletion, and searching: O(1) time
        HashMap<String, Integer> map = new HashMap<>();
        map.put("raghav", 10);
        map.put("aditi", 55);
        map.put("amit", 89);
        map.put("anup", 23);
        map.put("joker", 30);
        System.out.println(map + " "+ map.size());    // in hashmap result get in random order

//        map.remove("aditi");
        System.out.println(map.remove("aditi"));    // remove(key): then it returns key's value
        System.out.println(map.remove("amit",89));      // remove(key, value) : it returns boolean
        System.out.println(map + " "+ map.size());

        map.put("raghav", -8);      // in hashmap duplicates elements will replace i.e. keys are unique but values can be more than one
        map.put("gill", -8);
        System.out.println(map + " "+ map.size());

        System.out.println(map.containsKey("joker"));
        System.out.println(map.containsValue(-8));

        System.out.println(map.get("joker"));       // same as remove(key): it gives key's value
        System.out.println();

        // loop
        for(String key : map.keySet()){     // important
            System.out.println(key+" "+map.get(key));
        }

        System.out.println();
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
