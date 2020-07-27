package java;

import java.util.ArrayList;
import java.util.List;

public class NumOfBurgers {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if (tomatoSlices % 2 == 0) {
            tomatoSlices /= 2;
            int x = tomatoSlices - cheeseSlices;
            if (x >= 0 && cheeseSlices - x > 0) {
                return List.of(x, cheeseSlices - x);
            }

        }

        return new ArrayList<>();

    }

}