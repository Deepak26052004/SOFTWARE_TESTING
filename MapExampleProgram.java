import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        // 1. Put
        map.put(1, "Deepak");
        map.put(2, "Mahesh");
        map.put(3, "Vijay Bala");
        map.put(4, "Suriya");
        map.put(5, "Udhaya Prakash");
        
        //2. Get
        System.out.println(map.get(2));
        System.out.println(map.get(5));

        // 3. Remove
        String removed=map.remove(5);
        System.out.println("Removed Element:"+removed);
        System.out.println("After Removing:"+map);

        // 4. Contains
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(5));

        System.out.println(map.containsValue("Deepak"));
        System.out.println(map.containsValue("Mahesh"));

        //5. Size
        System.out.println("Size:"+map.size());

        //6. isEmpty
        System.out.println("Empty:"+map.isEmpty());

        //7. Clear
        map.clear();
        System.out.println(map);

        map.put(1, "Deepak");
        map.put(2, "Mahesh");
        map.put(3, "Vijay Bala");
        map.put(4, "Suriya");
        map.put(5, "Udhaya Prakash");

        //8. Key Set
        Set<Integer> keys=map.keySet();
        System.out.println("Keys in the Map:"+keys);

        //9. Values
        Collection<String> vls=map.values();
        System.out.println("Values:"+vls);

        //10. Entry Set
        System.out.println("Iteration Of Map1");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }
        HashMap<Integer,String> map2=new HashMap<>();
        map2.put(6, "Rajesh");
        map2.put(7, "Arjun");
        map2.put(8, "Karthik");
        map2.put(9, "Anil");
        map2.put(10, "Ramesh");
        System.out.println("Iteration Of Map2");
        for(Map.Entry<Integer,String> entry2:map2.entrySet()){
            System.out.println(entry2.getKey()+" -> "+entry2.getValue());
        }

        //11. Put If the Key and Value if the Key is Not Present
        System.out.println(map.putIfAbsent(6, "Ayush"));
        System.out.println(map.putIfAbsent(1, "Rachin"));
        System.out.println(map);

        //12. Compute the Values If the key is Not present
        System.out.println(map.computeIfAbsent(7, k -> "Deepak"+5));
        System.out.println(map);

        // 13. Merge
        map.merge(1, " Mhatre", String::concat);
        System.out.println(map);

    }
}
