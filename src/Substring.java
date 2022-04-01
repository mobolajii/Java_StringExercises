import java.util.Scanner;

public class Substring {
    //counts how often a substring appears in a String

    static int substring(String s){
        int count = 0;
        int i = 0;

        while((i=s.indexOf(s.substring(0,4), i))!=-1){
            count++;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(substring(s));
    }

}
