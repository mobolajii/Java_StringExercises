
import java.util.*;
import java.lang.*;


class StringExercises{

    static int[] checkIP(String s) {
        if(s == null)
            return null;
        int[] arr = new int[4];
        StringTokenizer tokens = new StringTokenizer(s,".");
        if(tokens.countTokens() != 4)
            return null;
        int j = 0;
        while(tokens.hasMoreTokens()){
            String u = tokens.nextToken();
            if(u.length() == 0)
                return null;
            for (int i = 0; i < u.length(); i++) {
                if(!Character.isLetterOrDigit(i))
                    return null;
            }
            arr[j] = Integer.parseInt(u);
            if(arr[j] >255)
                return null;
            j++;
        }
        return arr;
    }




    static boolean isUniTrier(String s){

        StringTokenizer st = new StringTokenizer(s, ".");
        ArrayList<String> elements = new ArrayList<String>();

        for(int i=0; i<st.countTokens(); i++){
            elements.add(st.nextToken());
        }
        for(int i=0; i<elements.size(); i++){
            String oneS = elements.get(0);
            String twoS = elements.get(1);


            int oneI = Integer.parseInt(oneS);
            int twoI = Integer.parseInt(twoS);




            if(oneI == 136 && twoI == 199)return true;



        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

       System.out.println(checkIP(s));
        System.out.println(isUniTrier(s));
    }

}

