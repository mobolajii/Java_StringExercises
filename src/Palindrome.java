public class Palindrome {
    //returns true if String is a palindrom
    static boolean palindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        if(s.equals(rev))return true;
        return false;
    }
}
