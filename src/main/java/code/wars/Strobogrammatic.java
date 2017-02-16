package code.wars;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Strobogrammatic {

    private Map<String, List<String>> validTransforms;

    public Strobogrammatic() {
        this.validTransforms = new HashMap<String, List<String>>();
        this.validTransforms.put("0", Arrays.asList("0"));
        this.validTransforms.put("1", Arrays.asList("1"));
        this.validTransforms.put("6", Arrays.asList("9"));
        this.validTransforms.put("8", Arrays.asList("8"));
        this.validTransforms.put("9", Arrays.asList("6"));
    }

    public boolean exec(int num) {
        return this.exec(num+"");
    }

    public boolean exec(String num) {
        if(num.length() == 0) {
            return true;
        }
        if(num.length() == 1) {
            return this.validTransforms.containsKey(num);
        }
        String leftMost = num.substring(0,1);
        String rightMost = num.substring(num.length()-1);
        if(this.validTransforms.get(leftMost).contains(rightMost)) {
            return this.exec(num.substring(1,num.length()));
        }
        return false;
    }
}
