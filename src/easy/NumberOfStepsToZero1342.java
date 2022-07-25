package easy;

public class NumberOfStepsToZero1342 {
    public int numberOfSteps(int num) {
        int countSteps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                countSteps++;
            } else {
                num -= 1;
                countSteps++;
            }
        }
        return countSteps;
    }

    public static void main(String[] args) {
        NumberOfStepsToZero1342 c = new NumberOfStepsToZero1342();
        System.out.println(c.numberOfSteps(91));
    }
}
