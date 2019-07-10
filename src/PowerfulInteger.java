import java.util.ArrayList;
import java.util.List;

public class PowerfulInteger {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();

        int max = 6;

        for(int i = 0; i <= max; i++) {
            for(int j = 0; j <= max ; j++) {
                int target = (int) (Math.pow(x, i) + Math.pow(y, j));
                if(target <= bound && !res.contains(target)) {
                    res.add(target);
                }
            }
        }
        return res;
    }
}
