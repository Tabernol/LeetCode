package easy;

import java.util.Arrays;

public class TruncateSentence1816 {
    public String truncateSentence(String s, int k) {
        String[] sentence = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < k; i++) {
            str.append(sentence[i] + " ");
        }
        String result = String.valueOf(str).trim();
        return result;
    }

    public static void main(String[] args) {
        TruncateSentence1816 x = new TruncateSentence1816();
        System.out.println(x.truncateSentence("What is the solution to this problem", 4));
    }

}
