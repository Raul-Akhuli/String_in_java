import java.util.Scanner;

public class String_upper_lower_case_8 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String str1 = str.toUpperCase();
        String str2 = str.toLowerCase();

        System.out.println("Uppercase: " + str1);
        System.out.println("Lowercase: " + str2);
    }
}
