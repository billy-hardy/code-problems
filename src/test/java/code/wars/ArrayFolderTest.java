package code.wars;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import code.wars.ArrayFolder;

@RunWith(Parameterized.class)
public class ArrayFolderTest {

    public ArrayFolder folder;
    public int[] input;
    public int[] expected;

    public ArrayFolderTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<int[][]> data() {
        return Arrays.asList(new int[][][] {
            {{1,2,3,4}, {5,5}}
        });
    }

    @Before
    public void setup() {
        folder = new ArrayFolder();
    }

    @Test
    public void testArrayFolder() {
        int[] actual = folder.fold(input);
        assertArrayEquals(expected, actual);
    }

}
