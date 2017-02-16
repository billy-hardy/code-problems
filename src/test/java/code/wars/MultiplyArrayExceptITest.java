package code.wars;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import code.wars.MultiplyArrayExceptITest;

@RunWith(Parameterized.class)
public class MultiplyArrayExceptITest {

    public MultiplyArrayExceptI multiplier;
    public int[] input;
    public int[] expected;

    public MultiplyArrayExceptITest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<int[][]> data() {
        return Arrays.asList(new int[][][] {
            {{1,2}, {2,1}},
            {{1,2,3}, {6, 3, 2}},
            {{1,2,3,4}, {24, 12, 8, 6}},
            {{0,1}, {1,0}}
        });
    }

    @Before
    public void setup() {
        multiplier = new MultiplyArrayExceptI();
    }

    @Test
    public void testMultiplyArrayExceptI() {
        int[] actual = multiplier.exec(input);
        assertArrayEquals(expected, actual);
    }

}
