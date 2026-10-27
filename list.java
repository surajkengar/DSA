import java.util.*;
public class list{
    public static void main(String args[]){
        Map<Integer , String> map = new HashMap<>();

        map.put(1 , "suraj");
        map.put(2 , "rohit");
        map.put(3 , "yuga");
        map.put(4 , "ritesh");
        map.put(5 , "santa");


        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("suraj"));
        System.out.println(map.size());
        System.out.println(map.getOrDefault(0 , "user"));
        System.out.println(map.remove(1));
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}