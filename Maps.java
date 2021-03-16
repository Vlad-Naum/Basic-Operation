package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
    public static void setMap(){
        Map map = new HashMap();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "");
        for (int i = 1; i <= map.size()+1; i++) {
            System.out.println(map.get(i));
        }
        System.out.println(map.entrySet());
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for(String str : copy.values()){
            int count = 0;
            for(String name : map.values()){
                if(name.equals(str)){
                    count++;
                }
            }
            if(count>1){
                removeItemFromMapByValue(map, str);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}
