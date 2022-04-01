import java.util.Scanner;

public class Twice {
    //returns true if character appears twice in a String
    static boolean twice(String s){
        System.out.println("Give in a character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c)count++;
        }

        if(count ==2)return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(twice(s));
    }
}
