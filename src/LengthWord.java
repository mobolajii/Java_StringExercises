import java.util.Scanner;

public class LengthWord {

    //counts how many words are in a StringArray
    static void countWords(String s){
       String[]data = s.split(" ");
       int result = 0;
        for(int i=0; i<data.length; i++){
            result = data[i].length();
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        countWords(s);
    }
}
