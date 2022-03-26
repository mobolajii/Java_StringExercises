import java.util.StringTokenizer;

public class Tokenize {
        //return tokenized String
        static String[] tokenize(String s){
                String[]data = new String[s.length()];
                StringTokenizer st = new StringTokenizer(s);

                for(int i=0; i< st.countTokens(); i++){
                        data[i] = st.nextToken();
                }

                return data;
        }




}
