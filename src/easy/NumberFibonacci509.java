package easy;

public class NumberFibonacci509 {
    int first;
    int result;
    int second=1;

    public int fib(int n) {
        for (int i = 0; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        NumberFibonacci509 x = new NumberFibonacci509();
        System.out.println(x.fib(2));
    }
}
