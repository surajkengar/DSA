import java.util.*;
public class sum3{
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};

        Arrays.sort(arr);

        List<List<Integer>> li = new ArrayList<>();

        for(int i=0;i<arr.length-2;i++){

            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }


            int left = i+1;
            int right = arr.length-1;

            while(left <  right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0){
                    li.add(Arrays.asList(arr[i] , arr[left] , arr[right]));

                    left++;
                    right--;

                    /*skip left repeted element */

                    while(left < right && arr[left] == arr[left - 1]){
                        left++;
                    }

                    /*skip right repeated element  */

                    while(left < right && arr[right] == arr[right+1]){
                        right--;
                    }
                }else if(sum < 0){
                    left++;
                }else if(sum > 0){
                    right--;
                }
            }
        }

        System.out.println(li);
    }
}