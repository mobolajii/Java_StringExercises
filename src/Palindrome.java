public class Palindrome {
    //returns true if String is a palindrome
    static boolean palindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();

        if(s.equals(reverse))return true;
        return false;
    }

}
