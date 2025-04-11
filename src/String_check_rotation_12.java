import java.util.Scanner;

public class String_check_rotation_12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the string to check it is the rotation of previous string or not: ");
        String check = sc.nextLine();

        if(check.length() != str.length()){
            System.out.println("This string is not a rotation of previous string ");
        }
        else{
            String combine = str + check;
            if(combine.contains(check)){
                System.out.println("This string is a rotation of previous string ");
            }
            else{
                System.out.println("This string is not a rotation of previous string ");
            }
        }
    }
}
