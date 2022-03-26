import java.util.Scanner;

public class Often {
    //returns how often a particular character is in a String //commit
    static int often(String s){
        System.out.println("Give in a characeter: ");
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c )count++;
        }
        return count;
    }

}
