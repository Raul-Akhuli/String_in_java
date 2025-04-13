import java.util.Scanner;

public class String_check_rotation_12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder str1 = new StringBuilder(str);

        System.out.println("Enter the string to check it is the rotation of previous string or not: ");
        String check = sc.nextLine();

        StringBuilder check1 = new StringBuilder(check);

        if(str1.toString().equals(check1.reverse().toString())){
            System.out.println("yes the string is the rotation of the previous string ");
        }
        else{
            System.out.println("No the string is not a rotation of the previous string ");
        }
    }
}
