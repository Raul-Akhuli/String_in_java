import java.util.Scanner;

public class String_find_duplicate_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to find the duplicate character: ");
        String str = sc.nextLine();

        boolean flag = false;

        boolean[] seen = new boolean[256];


        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
            } else {
                System.out.println(ch);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("No duplicate character present ");
        }
    }
}
