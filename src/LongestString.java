import javax.swing.*;
import java.util.Scanner;

public class LongestString {
    //returns the longest word
    static String longestString(String s){
        String length = " ";
        String[]data = s.split(" ");
        for(int i=0; i<data.length; i++){
            if(data[i].length()>length.length()){
                length = data[i];
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(longestString(s));
    }

}
