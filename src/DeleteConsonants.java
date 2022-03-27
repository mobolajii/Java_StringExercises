public class DeleteConsonants {
    //deletes all the consonants in a String
    static String deleteConsonants(String s){
        String consonants = "[^aeiouAEIOU]";

        return s.replaceAll(consonants, "");
    }


}
