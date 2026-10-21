import java.util.*;
public class list{
    public static void main(String args[]){
        List<Integer> li = new ArrayList<>();


        li.add(10);
        li.add(20);
        li.add(40);
        li.add(2 , 30);

        li.set(2 , 200);

        System.out.println(li.get(2));
        System.out.println(li);
        System.out.println(li.isEmpty());
        System.out.println(li.contains(20));

        for(int num : li){
            System.out.println(num);
        }

        li.remove(2);
        System.out.println(li);
        li.remove(Integer.valueOf(10));
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.clear());
        System.out.println(li);


    }
}