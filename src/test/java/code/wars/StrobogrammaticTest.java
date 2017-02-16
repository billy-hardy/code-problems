package code.wars;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import code.wars.Strobogrammatic;

@RunWith(Parameterized.class)
public class StrobogrammaticTest {

    public Strobogrammatic strob;
    public int input;
    public boolean expected;

    public StrobogrammaticTest(int input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {1,true},
               {69, true},
               {818, true},
               {808, true},
               {4, false}
        });
    }

    @Before
    public void setup() {
        strob = new Strobogrammatic();
    }

    @Test
    public void testStrobogrammatic() {
        boolean actual = strob.exec(input);
        assertEquals(expected, actual);
    }

}
