import java.util.*;
public class two_sum{
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 9;

        HashMap<Integer , Integer> map = new HashMap<>();

        int result[] = {-1 , -1};

        for(int i=0;i<arr.length;i++){
            int needed = target - arr[i];

            if(map.containsKey(needed)){
                result[0] = map.get(needed);
                result[1] = i;
            }

            map.put(arr[i] , i);
        }

        if(result[0] == -1){
            System.out.println("Result not found");
        }else{
            System.out.println(result[0] +" "+result[1]);
        }
    }
}