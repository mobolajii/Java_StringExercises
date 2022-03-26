import java.util.Scanner;

public class ContainsWord {
    //returns true if String contains a word
    static boolean containsWord(String s){
        System.out.println("Give in a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        return s.contains(word);
    }
}
