package easy.array;

public class MaximumNumberWordsFoundInSentences2114 {
    public int mostWordsFound(String[] sentences) {
        int maxCountWords = 0;
        for (String sen : sentences) {
            String[] sentence = sen.split(" ");
            if (sentence.length > maxCountWords) {
                maxCountWords = sentence.length;
            }
        }
        return maxCountWords;
    }

    public static void main(String[] args) {
        MaximumNumberWordsFoundInSentences2114 v = new MaximumNumberWordsFoundInSentences2114();
        int i = v.mostWordsFound(
                new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
        System.out.println(i);
    }
}
