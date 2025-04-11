import java.util.Scanner;

public class String_find_length_4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        int count = 0;
        for(char ch : arr){
            count++;
        }
        System.out.println("Length of the string is: " + count);
    }
}
