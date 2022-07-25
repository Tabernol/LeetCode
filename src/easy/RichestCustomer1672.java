package easy;

public class RichestCustomer1672 {
    int result;
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            int sumElements=0;
            for (int j = 0; j < accounts[i].length; j++) {
              sumElements += accounts[i][j];
            }
            if (sumElements > result) {
                result = sumElements;
            }
        }
        return result;
    }

    int[][] x = {{1, 22, 3}, {2, 3, 4},{5,6}, {5, 6}};

    public static void main(String[] args) {
        RichestCustomer1672 r = new RichestCustomer1672();
        r.maximumWealth(r.x);
    }
}
