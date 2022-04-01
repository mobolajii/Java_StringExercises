import java.util.Scanner;

public class Palindrome {
    //returns true if String is a palindrome

    static boolean palindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();

        return s.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(palindrome(s));
    }

}
