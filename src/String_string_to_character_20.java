import java.util.Scanner;

public class String_string_to_character_20 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert it into a character array: ");
        String str = sc.nextLine();

        System.out.println("Here is your charcter array ");

        for(char ch : str.toCharArray()){
            System.out.print(ch+ " " );
        }
    }
}
