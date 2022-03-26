public class Palindrome {
    //returns true if String is a palindrom
    static boolean palindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();

        return s.equals(reverse);
    }
}
