import java.util.Scanner;

public class String_check_contain_only_numeric_digit_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check only numeric digits present or not ");
        System.out.println("make sure it does no contain any space :");
        String str = sc.next();

        boolean flag = false;

        System.out.println();

        for (char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Other digit present rather then numeric digit ");
        }
        else{
            System.out.println("Only numeric digit present ");
        }
    }
}
