
import java.util.*;
import java.lang.*;


class StringExercises{

    static int[]checkIP(String s) {
        StringTokenizer st = new StringTokenizer(s, ".");
        ArrayList<String> elements = new ArrayList<String>();
        int[]newD = new int[2];

        for (int i = 0; i < st.countTokens(); i++) {
            elements.add(st.nextToken());
        }
        for (int i = 0; i < elements.size(); i++) {

            String oneS = elements.get(0);
            String twoS = elements.get(1);
            //String threeS = elements.get(2);
           // String fourS = elements.get(3);


            int oneI = Integer.parseInt(oneS);
            int twoI = Integer.parseInt(twoS);
           // int threeI = Integer.parseInt(threeS);
            //int fourI = Integer.parseInt(fourS);

            if(oneI<0 && oneI>255)return null;
            if(twoI<0 && twoI>255)return null;
           // if(threeI<0 && threeI>255)return null;
            //if(fourI<0 && fourI>255)return null;

            newD = new int[]{oneI +'.', twoI+'.', /*threeI+'.'fourI*/ };


        }



            return newD;
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

