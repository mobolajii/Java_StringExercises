import java.util.Scanner;

public class Cases {

    static String cases(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
               c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(cases(s));
    }
}


