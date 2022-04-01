import java.util.Scanner;
import java.util.StringTokenizer;

public class LengthWord {
    //counts how many words are in a StringArray
    static int lengthWord(String s){
        String[]data = s.split(" ");

        return data.length;
    }

    static int lengthWords(String s){
        StringTokenizer st = new StringTokenizer(s, " ");
        String[]data = new String[st.countTokens()];

       return data.length;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(lengthWord(s));
        System.out.println(lengthWords(s));
    }

}
