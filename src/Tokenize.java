import java.util.StringTokenizer;

public class Tokenize {
        //return tokenized String
    static String[]tokenize(String s){
        StringTokenizer st = new StringTokenizer(s, " ");
        String[]data = new String[st.countTokens()];

        for(int i=0; i< data.length; i++){
           data[i] = st.nextToken();
        }
        return data;


    }

}
