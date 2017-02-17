package code.wars;

public class TestCase<T,S> {
    public T input;
    public S expected;

    public TestCase(T input, S expected) {
        this.input = input;
        this.expected = expected;
    }
}

