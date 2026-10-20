import java.util.*;
public class valid_palindrom{
    public static int palindrom(String s){

        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }
        int i=0;
        int j = str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return 0;
            }

            i++ ;
            j--;
        }

        return 1;
    }
    public static void main(String args[]){
        String name = "madam";

        int result = palindrom(name);

        if(result == 1){
            System.out.print("String is plaindrom");
        }else{
            System.out.println("String is not a plaindrom");
        }
    }
}