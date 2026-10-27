import java.util.*;
public class valid_palindrom{
    public static boolean result(String str){
        StringBuilder str1 = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                str1.append(Character.toLowerCase(ch));
            }
        }

        int i=0;
        int j=str1.length()-1;

        while(i < j){
            if(str1.charAt(i) != str1.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
    public static void main(String args[]){
        String str = "madam";

        boolean temp = result(str);

        System.out.println(temp);


    }
}