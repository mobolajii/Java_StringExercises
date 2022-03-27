import java.util.Scanner;

public class LongestString {

        static String longestString(String s){
            String[]data = s.split(" ");

            String longest = " ";
            for(int i=0; i<data.length; i++){
                if(data[i].length() >longest.length()){
                    longest = data[i];
                }
            }
            return longest;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            System.out.println(longestString(s));
        }


}
