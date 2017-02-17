package code.wars;

import code.wars.structures.BinaryTree;

public class LeftMostBinaryTree {

    public int log(int num) {
        return (int) (Math.log(num)/Math.log(2));
    }
    
    public int pow(int base, int exp) {
        if(exp <= 0) {
            return 1;
        }
        if(exp == base) {
            return base;
        }
        return base*pow(base, exp-1);
    }

    public Integer find(BinaryTree tree) {
        int ret = 1;
        int lastLevelNum = this.log(tree.capacity())-1;
        int rowStart = this.pow(2, lastLevelNum-1)-1;
        int rowEnd = this.pow(2, lastLevelNum)-1;
        for (int i=rowStart; i<=rowEnd; i++) {
            Integer curr = tree.getLeft(i);
            if(curr != null) {
                return curr;
            }
            curr = tree.getRight(i);
            if(curr != null) {
                return curr;
            }
        }
        return ret;
    }
}
