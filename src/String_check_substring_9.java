import java.util.Scanner;

public class String_check_substring_9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the 2nd string: ");
        String str2 = sc.nextLine();

        String array1 = str1.toLowerCase();
        String array2 = str2.toLowerCase();

        if(array1.length() > array2.length()){
            if(array1.contains(array2)){
                System.out.println("2nd string is a substring of 1st string ");
            }
            else{
                System.out.println("2nd string is not a substring of 1st string ");
            }
        }
        else{
            System.out.println("2nd string is not a substring of 1st string ");
        }
    }
}
