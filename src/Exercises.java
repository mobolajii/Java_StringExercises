
import java.util.*;
import java.lang.*;


class Butterbrot{

    static boolean dop(String s){


        for(int i=0; i<s.length(); i++){
            int count = 0;

            //System.out.println("count "+ count);

           for (int j=0; j<s.length(); j++){
               //System.out.println("s.charAt(i) "+ s.charAt(i));
//               System.out.println("s.charAt(j) "+ s.charAt(j));
               if(s.charAt(i) == s.charAt(j))count++;

           }

            if(count==2)return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(dop(s));
    }
}

