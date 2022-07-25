package easy;

public class FindHighestAltitude1732 {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for (int element : gain) {
            altitude += element;
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        FindHighestAltitude1732 v = new FindHighestAltitude1732();
        System.out.println(v.largestAltitude(new int[]{-4,-3,-2,-1,-4,-3,-2}));
    }
}
