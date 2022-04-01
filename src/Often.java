

import java.util.Scanner;

public class Often {
    //returns how often a particular character is in a String

    static int often(String s){
        System.out.println("Give in a character: ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c)count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(often(s));
    }
}


