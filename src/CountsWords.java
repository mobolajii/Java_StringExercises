import java.util.Scanner;
import java.util.StringTokenizer;

public class CountsWords {
    //counts how many words are in a StringArray
    static int countsWord(String s){
        String[]data = s.split(" ");

        return data.length;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();

        System.out.println(countsWord(s));
    }

}
