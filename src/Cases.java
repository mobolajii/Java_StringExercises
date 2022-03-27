import java.util.Scanner;

public class Cases {
    //changes cases to opposite cases
    static String cases(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                Character.toUpperCase(c);
            }else if(Character.isUpperCase(c)){
                Character.toLowerCase(c);
            }
            sb.append(c);
        }

        return sb.toString();

    }
}
