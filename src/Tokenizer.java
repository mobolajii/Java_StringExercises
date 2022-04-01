import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

    static String tokenizer(String s){
        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<String>elements = new ArrayList<>();

        while(st.hasMoreTokens()){
            elements.add(st.nextToken());
        }

        String a = "";
        String b ="";
        String c="";
        for (int i=0; i<elements.size(); i++){
           a = elements.get(0);
           b = elements.get(1);
           c = elements.get(2);


        }

        return a.charAt(0) + "." + b.charAt(0) + "." + c + ".";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println();

        System.out.println(tokenizer(s));
    }


}
