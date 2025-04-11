import java.util.Scanner;

public class String_first_non_repeating_character_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        boolean flag = true;
        for(char i : str.toCharArray()){
            if(str.indexOf(i) == str.lastIndexOf(i)){
                System.out.println("First non repeating character is: " + i);
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("There is no such character present which is not repeating ");
        }
    }
}
