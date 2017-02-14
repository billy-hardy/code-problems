package code.wars;

public class MultiplyArrayExceptI {
    public int[] exec(int[] arr) {
        int[] front = new int[arr.length];
        int[] back = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            front[i] = 1;
            back[i] = 1;
        }
        front[0] = arr[0];
        back[0] = arr[arr.length-1];
        for(int i=1; i<arr.length; i++) {
            front[i] *= front[i-1] * arr[i];
            back[i] *= back[i-1] * arr[arr.length-1-i];
        }
        int[] ret = new int[arr.length];
        for(int i=0; i<ret.length-1; i++) {
            ret[i+1] = front[i] * back[ret.length-1-i];
        }
        ret[0] = back[ret.length-1-1];
        ret[ret.length-1] = front[ret.length-1-1];
        return ret;
    }
}
