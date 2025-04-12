import java.util.Scanner;
public class String_frequent_character_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = sc.nextLine();
        String str = str1.toLowerCase();
        char [] arr1 = str.toCharArray();
        char ch = '\0';
        int count = 0;
        int count1 = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(arr1[i] == arr1[j]){
                    count1++;
                }
            }
            if(count1 > count) {
                count = count1;
                ch = arr1[i];
            }
        }
        System.out.println("Most frequent character is: " + ch);
    }
}
