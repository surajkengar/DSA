import java.util.*;
public class largest_element{
    public static int large_element(int arr[]){
         int large = arr[0];

         for(int i=1;i<arr.length;i++){
            if(arr[i] > large){
                large = arr[i];
            }
         }

         return large;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,11,23};

        int element = large_element(arr);

        System.out.println(element);
    }
}