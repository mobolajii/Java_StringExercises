import java.util.Scanner;
import java.util.StringTokenizer;

public class Times {

    //returns how many times a word appears in an array

    static int times(String s){
        System.out.println("Give in a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;

        String[]data = s.split(" ");
        for(int i=0; i<data.length; i++){
            if(data[i].contains(word))count++;
        }

        return count;
    }

    static int time(String s){
        StringTokenizer st = new StringTokenizer(s, " ");
        String[]data = new String[st.countTokens()];

        System.out.println("Give in a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;

        for(int i=0; i<data.length; i++){
            data[i] = st.nextToken();
        }

        for (int i=0; i< data.length; i++){
            if(data[i].contains(word)) count++;
        }
       return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(times(s));
        System.out.println(time(s));
    }
}
