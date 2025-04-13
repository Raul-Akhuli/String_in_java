import java.util.Scanner;

public class String_remove_duplicate_15{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove duplicate character: ");
        String str = sc.nextLine();

        StringBuilder res = new StringBuilder();
        boolean [] seen = new boolean[256];

        for(char ch : str.toCharArray()){
            if(!seen[ch]){
                res.append(ch);
                seen[ch] = true;
            }
        }
        System.out.println("String after remove the duplicate character: " + res);
    }
}