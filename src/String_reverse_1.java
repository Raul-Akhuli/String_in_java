import java.util.Scanner;

public class String_reverse_1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str1 = sc.nextLine();

        String reverse = "";

        char [] arr1 = str1.toCharArray();

        for(int i = 0; i < str1.length(); i++){
            reverse = arr1[i] + reverse;
        }

        System.out.println("Your desire string is: " + reverse);
    }
}
