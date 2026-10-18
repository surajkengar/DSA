import java.util.*;
public class smallest_element{
    public static int small(int arr[]){
        int small_element = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < small_element){
                small_element = arr[i];
            }
        }

        return small_element;
    }
    public static void main(String args[]){
        int arr[] = {41,121,32,45,32,112,1222};

        int element = small(arr);

        System.out.println(element);
    }
}