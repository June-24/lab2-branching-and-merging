public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
