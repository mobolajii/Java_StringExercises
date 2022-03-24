import java.util.Scanner;

public class Equal {
    //returns true if two Strings are equal
    static boolean equal(String s){
        System.out.println("Give in a word: ");
        Scanner sc = new Scanner(System.in);
        String b =  sc.nextLine();
        if(s.equals(b))return true;
        return false;
    }
}
