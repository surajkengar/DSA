import java.util.*;
public class two_sum_optimize{
    public static int[] calculate(int arr[] , int target){
          int i=0;
          int j=arr.length-1;
          int new_arr[] = {-1 , -1};

          while(i < j){
             int result = arr[i] + arr[j];

             if(target == result){
                 new_arr[0 ] = i+1;
                 new_arr[1] = j+1;

                 return new_arr;
             }else if(result > target){
                j--;
             }
             else if(result < target){
                i++;
             }
          }

          return new_arr;
    }
    public static void main(String args[]){
        int arr[] = {2,5,8,11,15,19};

        int result[] = calculate(arr , 13);

        if(result[0] == -1 || result[1] == -1){
            System.out.println("result not found");
        }else{
            System.out.println(result[0] + " " +result[1]);
        }
    }
}