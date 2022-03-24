
import java.util.*;
import java.lang.*;


class StringExercises{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Does it contain the word? " + ContainsWord.containsWord(s));
        System.out.println("How many vowels are in the first String? " + CountVowels.countVowels(s));
        System.out.println("Deletes all the consonants in the first String: " + DeleteConsonants.deleteConsonants(s));
        System.out.println("Is the given word the same as the first word? " + Equal.equal(s));
        System.out.println("How long is the first String? " + Length.length(s));
        System.out.println("How often does the character appear in the first String? " + Often.often(s));
        System.out.println("How often do the first four characters of the first String appear in the same String? " + Substring.substring(s));
        System.out.println("How often does the reversed version of the first String appear in the same String " + Reverse.reverse(s));
        System.out.println("If the 'a' appears in the first String, does it appear again after skipping exactly one character? " + Pos.pos(s));
        System.out.println("Change the cases into their opposite cases: " + Cases.cases(s));
        System.out.println("Is the first String a palindrome? " + Palindrome.palindrome(s));
        System.out.println("Does the given character appear twice in the first String? " + Twice.twice(s));

        String[]info = Tokenize.tokenize(s);
        System.out.println("Return the tokenized String back below: ");
        for(int i = 0; i < info.length; i++){
            System.out.print(info[i]);
        }

        System.out.println();

        System.out.println( Extract.extract(s));





    }
}

