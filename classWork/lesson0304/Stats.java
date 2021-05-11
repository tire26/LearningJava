package classWork.lesson0304;

public class Stats<T extends Number> {

    private T[] nums;

    public Stats(T[] nums) {

        this.nums = nums;
    }

    public double average() {

        double sum = 0;
        for (int i = 0; i < nums.length; ++i) {

            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    public static boolean sameAvg(Stats<?> stats1, Stats<?> stats2) {

        return stats1.average() == stats2.average();
    }

    public static <T extends Number> boolean equelsAvg(Stats<T> stats1, Stats<?> stats2) {

        return stats1.average() == stats2.average();
    }
}
