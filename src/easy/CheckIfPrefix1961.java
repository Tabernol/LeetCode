package easy;

public class CheckIfPrefix1961 {
    public boolean isPrefixString(String s, String[] words) {
        String result = "";
        boolean answer= false;
        for (int i = 0; i < words.length; i++) {
            result = result.concat(words[i]);
            if (s.length() == result.length()) {
                answer = s.equals(result);
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        CheckIfPrefix1961 c = new CheckIfPrefix1961();
        c.isPrefixString("iloveleetcode",new String[]{"love","i","leetcode"});
    }
}
