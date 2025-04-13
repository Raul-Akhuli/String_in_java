import java.util.Scanner;

public class String_word_count_16 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count words: ");
        String str = sc.nextLine();
        char [] arr1 = str.toCharArray();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(' ' == arr1[i]){
                count ++;
            }
        }
        System.out.println("No of words present in this string: " + (count +1));
    }
}
