import java.util.Scanner;

public class CountVowels {
    //counts the number of vowels in a String
    static int countVowels(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();

        System.out.println(countVowels(s));
    }

}
