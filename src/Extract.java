
import java.util.Scanner;


public class Extract {

    //extracts the substring in brackets

    static String extract(String s){
        for(int i=0; i<s.length(); i++){
            s = s.substring(s.indexOf("[") +1);
            s = s.substring(0, s.indexOf("]"));
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(extract(s));
    }

}
