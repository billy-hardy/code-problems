package code.wars;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Strobogrammatic {

    private Map<String, String> validTransforms;

    public Strobogrammatic() {
        this.validTransforms = new HashMap<String, String>();
        this.validTransforms.put("0", "0");
        this.validTransforms.put("1", "1");
        this.validTransforms.put("6", "9");
        this.validTransforms.put("8", "8");
        this.validTransforms.put("9", "6");
    }

    public boolean exec(int num) {
        return this.exec(num+"");
    }

    public boolean exec(String num) {
        if(num.length() == 0) {
            return true;
        }
        if(num.length() == 1) {
            return num.equals("0") || num.equals("1") || num.equals("8");
        }
        String leftMost = num.substring(0,1);
        String rightMost = num.substring(num.length()-1);
        if(this.validTransforms.get(leftMost).equals(rightMost)) {
            return this.exec(num.substring(1, num.length()-1));
        }
        return false;
    }
}
