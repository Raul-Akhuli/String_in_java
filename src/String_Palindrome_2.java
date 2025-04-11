import java.util.Scanner;
import java.util.Arrays;
public class String_Palindrome_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        String reverse = "";
        char [] arr1 = str1.toCharArray();

        for(int i = 0; i < str1.length(); i++){
            reverse = arr1[i] + reverse;
        }
        char [] arr2 = reverse.toCharArray();

        if(Arrays.equals(arr2, arr1)){
            System.out.println("Palindrome in nature ");
        }
        else{
            System.out.println("Not Palindrome ");
        }
    }
}
