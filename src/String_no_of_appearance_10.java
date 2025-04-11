import java.util.Scanner;

public class String_no_of_appearance_10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("To check no of appearance enter a character: ");
        char ch = sc.next().charAt(0);
        char [] arr = str.toCharArray();
        int count = 0;
        System.out.println();
        for(int i = 0; i < str.length(); i++){
            if(ch == arr[i]){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Character not present in the given string ");
        }
        else{
            System.out.println("No of appearance: " + count);
        }
    }
}
