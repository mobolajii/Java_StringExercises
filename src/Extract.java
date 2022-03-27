import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract {

    //extracts the substring in brackets
    static String extract(String s){

        String brackets = "\\[(.*?)\\]";
        Pattern pattern = Pattern.compile(brackets);
        Matcher matcher = pattern.matcher(s);


        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
        return "";
    }
}
