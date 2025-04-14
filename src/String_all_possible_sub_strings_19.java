import java.util.Scanner;

public class String_all_possible_sub_strings_19 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find out possible sub-strings: ");
        String str = sc.nextLine();
        char [] arr = str.toCharArray();

        String res = "";
        System.out.println("Possible sub-strings are : ");
        for(int i=0; i < str.length(); i++){
            res = res + arr[i];
            System.out.println(res);
            System.out.println();
        }
    }
}
