import java.util.Scanner;
import java.util.StringTokenizer;
public class CountWords {

        static int countWords(String text, String word){
            StringTokenizer st = new StringTokenizer(text, " ");
            String[]data = new String[st.countTokens()];

            for(int i=0; i<data.length; i++){
                data[i] = st.nextToken();
            }
            int count = 0;
            for(int i=0; i<data.length; i++){
                if(data[i].contains(word))count++;
            }
            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String word = sc.nextLine();

            System.out.println(countWords(text, word));
        }


}
