package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapItr {
    public static void main(String[] args) {
        Map map=new HashMap<>();

        map.put(1, "Mumbai");
        map.put(2, "Delhi");
        map.put(3, "Chennai");

        Iterator itr=map.keySet().iterator();

        while(itr.hasNext())
        {
           Integer key=(Integer) itr.next();
           System.out.println(key);
        }

        Iterator itrVal=map.values().iterator();

        while(itrVal.hasNext())
        {
            String key=(String) itrVal.next();
            System.out.println(key);
        }

       Iterator eSetItr= (Iterator) map.entrySet().iterator();

        while(eSetItr.hasNext())
        {
            Map.Entry entry= (Map.Entry) eSetItr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
