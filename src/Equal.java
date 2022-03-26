import java.sql.SQLOutput;
import java.util.Scanner;

public class Equal {
    //returns true if two Strings are equal
    static boolean equal(String s){
        System.out.println("Give in a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        return s.equals(word);

    }
}
