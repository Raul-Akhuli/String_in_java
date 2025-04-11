import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String string1 = sc.nextLine();
        String str1 = string1.toLowerCase();

        char [] array1 = str1.toCharArray();

        Arrays.sort(array1);

        System.out.println(array1);
    }
}
