import java.util.Scanner;

public class String_vowles_consonents_count_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        String str1 = str.toLowerCase();
        int no_of_vowles = 0;
        int no_of_consonents = 0;
        char [] arr1 = str1.toCharArray();
        for(int i = 0; i < str1.length(); i++){
            char ch = arr1[i];
            if(ch >= 'a' && ch <= 'z'){
                if(arr1[i] == 'a' || arr1[i] == 'e' || arr1[i] == 'i' || arr1[i] == 'o' || arr1[i] == 'u'){
                    no_of_vowles++;
                }
                else{
                    no_of_consonents++;
                }
            }
        }
        System.out.println("No of vowles: " + no_of_vowles);
        System.out.println("No of consonants: " + no_of_consonents);
    }
}
