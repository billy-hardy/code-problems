package code.wars;

import code.wars.structures.BinaryTree;

public class LeftMostBinaryTree {

    public int log(int num) {
        int log = (int) (Math.log(num)/Math.log(2));
        if((int) Math.pow(2, log) == num) {
            return log+1;
        }
        return log;
    }

    public int pow(int base, int exp) {
        if(exp <= 0) {
            return 1;
        }
        return base*pow(base, exp-1);
    }

    public Integer find(BinaryTree tree) {
        int lastLevelNum = this.log(tree.capacity())-2;
        int rowStart = this.pow(2, lastLevelNum-1)-1;
        int rowEnd = this.pow(2, lastLevelNum);
        for (int i=rowStart; i<rowEnd; i++) {
            Integer curr = tree.getLeft(i);
            if(curr != null) {
                return curr;
            }
            curr = tree.getRight(i);
            if(curr != null) {
                return curr;
            }
        }
        return null;
    }
}
