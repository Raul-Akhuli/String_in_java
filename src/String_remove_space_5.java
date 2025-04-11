import java.util.Scanner;
public class String_remove_space_5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String str = sc.nextLine();
        String str1 = str.replace(" ", "");
        System.out.println("Desire string was: " + str1);
    }
}
