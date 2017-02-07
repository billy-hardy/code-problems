package code.wars;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import code.wars.RotAtI;

@RunWith(Parameterized.class)
public class RotAtITest {

    public int input;
    public int expected;

    public RotAtITest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1,1}, {12, 21}, {123, 231}, {321, 321}
        });
    }

    @Test
    public void testRotAtI() {
        RotAtI rotater = new RotAtI();
        int actual = rotater.exec(input);
        assertEquals(expected, actual);
    }

}
