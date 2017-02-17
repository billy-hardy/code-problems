package code.wars.structures;

public class BinaryTree {
    private Integer[] tree;
    private int size;
    private int capacity;

    public BinaryTree() {
        this(new Integer[0]);
    }

    public int pow(int base, int pow) {
        if(pow <= 0) {
            return 1;
        }
        if(pow == 1) {
            return base;
        }
        return base*this.pow(base, pow-1);
    }

    public int log(int num) {
        return (int) (Math.log(num)/Math.log(2));
    }

    public BinaryTree(Integer[] tree) {
        this.capacity = this.pow(2, this.log(tree.length)+1);
        this.tree = new Integer[this.capacity];
        for(int i=0; i<tree.length; i++) {
            this.tree[i] = tree[i];
            if(tree[i] != null) {
                this.size++;
            }
        }
    }

    public Integer getLeft(int i) {
        int left = i*2+1;
        return this.get(left);
    }

    public Integer getRight(int i) {
        int right = i*2+2;
        return this.get(right);
    }

    private Integer get(int i) {
        if(i < this.capacity) {
            return this.tree[i];
        }
        throw new IndexOutOfBoundsException();
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }
}
