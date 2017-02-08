package code.wars;

public class RotAtI {

    public int exec(int num) {
        int max = num;
        String s = num + "";
        for(int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) > s.charAt(i+1)){
                return max;
            }
            s = rotAtI(s, i);
            num = Integer.parseInt(s);
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public String rotAtI(String num, int i) {
        String s = num + "";
        String temp = s.substring(0, i) + s.substring(i+1) + s.substring(i, i+1);
        return temp;
    }

    public int pow(int base, int exp) {
        int power = 1;
        for(int i = 0; i < exp; i++) {
            power *= base;
        }
        return power;
    }

}
