import java.util.Scanner;

public class Dots {


    static String dots(String s, String t){
        int numOfDots = 27 -(s.length() + t.length()) ;

        String result = s;
        for(int i=0; i<numOfDots; i++){
            result = result + ".";
        }

        return result.concat(t);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(dots(s, t));
    }
}
