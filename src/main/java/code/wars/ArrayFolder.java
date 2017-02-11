package code.wars;

public class ArrayFolder {
    
    public int[] fold(int[] arr) {
        int[] ret = new int[(arr.length+1)/2];
        for(int i=0; i<arr.length/2; i++) {
            ret[i] = arr[i] + arr[arr.length-1-i];
        }
        if(arr.length%2 == 1) {
            ret[ret.length-1] = arr[ret.length-1];
        }
        return ret;
    }
}
