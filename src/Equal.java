import java.util.Scanner;

public class Equal {
    //returns true if two Strings are equal
    static boolean equal(String s){
        System.out.println("Give in a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        return s.equals(word);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(equal(s));
    }
}
