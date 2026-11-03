import java.util.ArrayList;
import java.util.List;
class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> res = new ArrayList<>();
        long val = n;
        res.add(val);
        while (val != 1) {
            if (val % 2 == 0) 
                val = (long) Math.floor(Math.sqrt(val));
            else 
                val = (long) Math.floor(Math.pow(val, 1.5));
            res.add(val);
        }
        return res;
    }
}
