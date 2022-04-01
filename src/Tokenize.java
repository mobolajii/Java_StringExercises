import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenize {
        //returns tokenized String

    static String[] tokenize(String s){
        StringTokenizer st = new StringTokenizer(s, " ");
        String[]data = s.split(" ");

        for(int i=0; i<data.length; i++){
            data[i] = st.nextToken();
        }

        return data;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[]data = tokenize(s);
        for(int i=0; i<data.length; i++){
            System.out.print (data[i] + " ");
        }

    }



}


