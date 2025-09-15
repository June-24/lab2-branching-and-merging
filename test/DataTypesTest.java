import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTypesTest {

    @Test

    public void largeSumTest() {

        // You put an L at the end to indicate it is a long.
        // try removing the L and you'll see that you get an error
        // saying "Integer number too large".
        // Note: You can use _ to help make it easier to
        //       read large numbers, as is done below.
        long x = 500_000_500_000L;
        int[] numbers = new int[1_000_000];
        for (int i = 1; i <= 1_000_000; i++) {
            numbers[i-1] = i;
        }
        assertEquals(x, DataTypes.sum(numbers), "sum from 1 to 1 million should be " + x);
    }
}
