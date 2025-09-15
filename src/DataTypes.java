public class DataTypes {

    public static void main(String[] args) {
        long x = 500_000_500_000L;
        int[] numbers = new int[100000];
        for (int i = 1; i <= 100000; i++) {
            numbers[i-1] = i;
        }
        System.out.println(DataTypes.sum(numbers));
    }

    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
