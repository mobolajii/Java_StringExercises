public class Pos {

    //returns true if 'a' appears at two positions and is a character apart from each other
    static boolean pos(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(j) =='a'){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
