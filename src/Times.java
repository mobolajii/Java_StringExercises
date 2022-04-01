import java.util.Scanner;
import java.util.StringTokenizer;

public class Times {

    //how many times does word appear in a string.

    static int times(String s, String word){
        StringTokenizer st = new StringTokenizer(s, " ");
        String[]data = new String[st.countTokens()];
        int count = 0;

        for(int i=0; i<data.length; i++){
            data[i] = st.nextToken();
        }
        for (int i=0; i<data.length; i++){
            if(data[i].contains(word))count++;
        }
        return count;
    }

    static int timeS(String s, String word){
        String[]data = s.split(" ");
        int count = 0;

        for(int i=0; i<data.length; i++){
            if(data[i].contains(word))count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = sc.nextLine();

        System.out.println(times(s,word));
        System.out.println(timeS(s, word));
    }
}
