import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

    static void tokenizer(String s){
        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<String>elements = new ArrayList<String>();


        while(st.hasMoreTokens()){
            elements.add(st.nextToken());
        }


        for(int i=0; i< elements.size(); i++ ){
            String a = elements.get(0);
            String b = elements.get(1);
            String c = elements.get(2);


            System.out.println(a.charAt(0) + "." + b.charAt(0) + "." + c +".");
            break;

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        tokenizer(s);
    }
}
