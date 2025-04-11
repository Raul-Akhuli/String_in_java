import java.util.Scanner;
import java.util.Arrays;
public class String_anagrams_6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String string1 = sc.nextLine();
        String str1 = string1.toLowerCase();

        System.out.println("Enter string 2: ");
        String string2 = sc.nextLine();
        String str2 = string2.toLowerCase();

        if(str1.length() == str2.length()){
            char [] array1 = str1.toCharArray();
            char [] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if(Arrays.equals(array1,array2)){
                System.out.println("They are anagrams ");
            }
            else{
                System.out.println("They are not anagrams ");
            }
        }
        else{
            System.out.println("They are not anagrams ");
        }
    }
}
