import java.util.Scanner;

public class LongestString {
    //returns the longest word
    static String longestWord(String s){
        String[]data = s.split(" ");
        String length = " ";

        for (int i=0; i<data.length; i++){
            if(data[i].length()>length.length()){
                length = data[i];
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(longestWord(s));
    }

}
