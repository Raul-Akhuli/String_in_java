import java.sql.SQLOutput;
import java.util.Scanner;

public class String_longest_common_prefix_18 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string: ");
        String str1 = sc.nextLine();
        char [] arr1  = str1.toCharArray();

        System.out.println("Enter the 1st string: ");
        String str2 = sc.nextLine();
        char [] arr2  = str2.toCharArray();

        StringBuilder res = new StringBuilder();

        int minlength = Math.min(arr1.length , arr2.length);

        boolean flag = false;

        for(int i = 0; i < minlength; i++){
            if(arr1[i] == arr2[i]){
                res.append(arr1[i]);
                flag = true;
            }
            else{
                break;
            }
        }
        System.out.println();
        if(flag){
            System.out.println("Longest common prefix between two string is: " + res);
        }
        else{
            System.out.println("No common prefix present ");
        }
    }
}
