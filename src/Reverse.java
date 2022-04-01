import java.util.Scanner;

public class Reverse {

    //count how often a reversed substring appears
    static int reverse(String s){
        int count = 0;
        int i = 0;

        StringBuilder sb = new StringBuilder(s.substring(0,4));
        String reverse = sb.reverse().toString();

        while((i=s.indexOf(reverse, i))!=-1){
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverse(s));
    }

}
