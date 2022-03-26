
import java.util.HashMap;

public class Occurences {

    /*
    Input a string of alphabets. Find out the number of occurrence of all alphabets in that string.
     Find out the alphabet with maximum occurrence.
     */

    static char occurence(String s){

        HashMap<Character, Integer>elements = new HashMap<Character, Integer>();

        for(int i=0; i<s.length(); i++) {

            char c = s.charAt(i);

            if(elements.containsKey(c)){
                elements.put(c, elements.get(c) + 1);
            }else{
                elements.put(c,1);
            }
        }



        char max = s.charAt(0);
        int count = elements.get(max);

        for(int j=1; j < s.length(); j++) {
            if(elements.get(s.charAt(j)) >= count){
                count = elements.get(s.charAt(j));
                max = s.charAt(j);
            }
        }

        System.out.println(elements);

        return max;
    }



}