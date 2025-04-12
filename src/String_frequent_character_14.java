import java.util.Scanner;
public class String_frequent_character_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to check frequency: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        char[] arr1 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch == arr1[i]) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Frequency of a character is: " + count);
        } else {
            System.out.println("No character found ");
        }
    }
}
