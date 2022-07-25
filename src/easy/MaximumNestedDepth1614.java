package easy;

public class MaximumNestedDepth1614 {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol == '(') {
                depth++;
            } else if (symbol == ')') {
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        MaximumNestedDepth1614 x = new MaximumNestedDepth1614();
        System.out.println(x.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
