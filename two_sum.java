import java.util.*;
public class two_sum{
    public static int[]  calculate(int arr[] , int target){
        int new_arr[] = {-1,-1};
         for(int i = 0 ;i<arr.length-1 ; i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    new_arr[0] = i+1 ;
                    new_arr[1] = j+1;
                    return new_arr;
                }
            }
         }

         return new_arr;
    }

    public static void main(String args[]){
        int arr[] = {  2, 5,8,11 , 15 , 19};

        int result[] = calculate(arr , 26 );

        if(result[0] == -1 || result[1] == -1){
            System.out.print("result not found");
        }else{
            System.out.print( result[0] + " "+ result[1]);
        }
    }
}