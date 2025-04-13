import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        vowels();
    }
//    static void reverseString(){
//        String str="madam";
//        String rev="";
//        for(int i=str.length()-1;i>=0;i--){
//            rev+=str.charAt(i);
//
//        }
//        if(str.equals(rev)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
//
//    }

    static void vowels(){
        String str="purvesh";
        int count=0;
        for(int i=0;i<=str.length();i++){
            char s=str.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                count++;
            }


        }
        System.out.println("vowels in this string is: "+count);

        }

    }
