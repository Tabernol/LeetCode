package easy;

public class MaxCanTipeWord1935 {
    int count;

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] array;
        array = text.split(" ");

        for (int j = 0; j < array.length; j++) {
            boolean wordNotBreak = true;
            for (int i = 0; i < brokenLetters.length(); i++) {
                String s = String.valueOf(brokenLetters.charAt(i));
                if (array[j].contains(s)) {
                    wordNotBreak = false;
                    break;
                }
            }
            if (wordNotBreak) {
                System.out.println(array[j]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxCanTipeWord1935 c = new MaxCanTipeWord1935();
        System.out.println(c.canBeTypedWords("leet codet iyu bnh ty lt r xc nb aq tr", "lt"));
    }
}
