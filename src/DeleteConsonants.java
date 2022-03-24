public class DeleteConsonants {
    //deletes all the consonants in a String
    static String deleteConsonants(String s){
        String vowels = "[^aeiouAEIOU]";
        return s.replaceAll(vowels, "");

    }
}
