import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import code.wars.LeftMostBinaryTree;
import code.wars.TestCase;
import code.wars.structures.BinaryTree;

@RunWith(Parameterized.class)
public class LeftMostBinaryTreeTest {

    public LeftMostBinaryTree leftMoster;
    public BinaryTree input;
    public int expected;

    public LeftMostBinaryTreeTest(TestCase<BinaryTree, Integer> testCase) {
        this.input = testCase.input;
        this.expected = testCase.expected;
    }

    @Parameters
    public static Collection<TestCase> data() {
        Integer[] input = {1,2,3};
        TestCase<BinaryTree, Integer> first = new TestCase<BinaryTree, Integer>(new BinaryTree(input), 2);
        Integer[] input2 = {1,2,3,null,4};
        TestCase<BinaryTree, Integer> second = new TestCase<BinaryTree, Integer>(new BinaryTree(input2), 4);
        Integer[] input3 = {1,2,3,4,5};
        TestCase<BinaryTree, Integer> third = new TestCase<BinaryTree, Integer>(new BinaryTree(input3), 4);
        TestCase[] tests = {first, second, third};

        return Arrays.asList(tests);
    }

    @Before
    public void setup() {
        leftMoster = new LeftMostBinaryTree();
    }

    @Test
    public void testLeftMostBinaryTree() {
        int actual = leftMoster.find(input);
        assertEquals(expected, actual);
    }

}
