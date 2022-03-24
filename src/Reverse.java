public class Reverse {

    //count how often a reversed substring appears
    static int reverse(String s){
        StringBuilder sb = new StringBuilder(s.substring(0,4));
        String rev = sb.reverse().toString();

        int i=0;
        int count = 0;

        while((s.indexOf(rev,i))!=-1){
            i++;
            count++;
        }
        return count;
    }
}
