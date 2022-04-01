
import java.util.Scanner;

public class Equal {
    //returns true if two Strings are equal
    static boolean equal(String s, String t){
        return s.equals(t);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(equal(s,t));

    }
}
