package code.wars;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Strobogrammatic {

    private Map<String, String> mirror;

    public Strobogrammatic() {
        this.mirror = new HashMap<String, String>();
        this.mirror.put("0", "0");
        this.mirror.put("1", "1");
        this.mirror.put("6", "9");
        this.mirror.put("8", "8");
        this.mirror.put("9", "6");
    }

    public boolean exec(int num) {
        return this.exec(num+"");
    }

    public boolean exec(String num) {
        num = num.intern();
        if(num.length() == 0) {
            return true;
        }
        if(num.length() == 1) {
            return num == "0" || num == "1" || num == "8";
        }
        String leftMost = num.substring(0, 1).intern();
        String rightMost = num.substring(num.length()-1).intern();
        if(this.mirror.get(leftMost) == rightMost) {
            return this.exec(num.substring(1, num.length()-1));
        }
        return false;
    }
}
