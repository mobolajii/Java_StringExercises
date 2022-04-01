import java.util.Scanner;

public class DeleteConsonants {
    //deletes all the consonants in a String

    static String deleteConsonants(String s){
        String consonants = "[^aeiouAEIOU]";

        return s.replaceAll(consonants, "");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(deleteConsonants(s));

    }
}
