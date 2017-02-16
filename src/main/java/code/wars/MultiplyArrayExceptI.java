package code.wars;

public class MultiplyArrayExceptI {
    public int[] exec(int[] arr) {
        int[] front = new int[arr.length];
        int[] back = new int[arr.length];
        front[0] = 1;
        back[arr.length-1] = 1;
        for(int i=1; i<arr.length; i++) {
            front[i] = front[i-1] * arr[i-1];
            back[arr.length-i-1] = back[arr.length-i] * arr[arr.length-i];
        }
        int[] ret = new int[arr.length];
        for(int i=0; i<ret.length; i++) {
            ret[i] = front[i] * back[i];
        }
        return ret;
    }
}
