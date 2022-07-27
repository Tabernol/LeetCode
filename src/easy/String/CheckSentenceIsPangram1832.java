package easy.String;

import java.util.HashSet;
import java.util.Set;

public class CheckSentenceIsPangram1832 {
    Set<Character> alphabet = new HashSet<>();
    public boolean checkIfPangram(String sentence) {
        for (int i =0; i<sentence.length(); i++){
            alphabet.add((sentence.charAt(i)));
            if(alphabet.size()==26){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CheckSentenceIsPangram1832 checkSentenceIsPangram1832 = new CheckSentenceIsPangram1832();
        System.out.println(checkSentenceIsPangram1832.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
