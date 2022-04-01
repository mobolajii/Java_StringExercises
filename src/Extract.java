import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {
    //extracts the word in the brackets
    static String extract(String s) {
        String brackets = "\\[(.*?)\\]";
        Pattern pattern = Pattern.compile(brackets);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(extract(s));
    }

}
