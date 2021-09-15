package logic;

import java.util.List;

public class Measure {
    private static double time;

    public static double getTime(List<Integer> list, int target, Algorithm alg){
        double before = System.nanoTime();
        int index = alg.invoke(list, target);
        double after = System.nanoTime();

        time = (after - before) / 1000;

        return time;
    }
}