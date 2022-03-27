public class Reverse {

    //count how often a reversed substring appears
    static int reverse(String s){
        int count = 0;
        StringBuilder sb = new StringBuilder(s.substring(0,4));
        String reverse = sb.reverse().toString();

       int i =0;
       while((i=s.indexOf(reverse, i))!=-1){
           i++;
           count++;
       }

       return count;
    }
}
