package test.test2.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> List<T> filter(T[] array, Filter<T> filter) {

        List<T> result = new ArrayList<>();
        for (T t : array) {

            if (filter.apply(t)) {

                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {


        if ("L".equals(args[0])) {

            Long[] input = new Long[args.length - 1];
            for (int i = 0; i < args.length; ++i) {

                input[i - 1] = Long.parseLong(args[1]);
            }
            List<Long> result = filter(input, new LongFilter());
            for (Long r : result) {
                System.out.print(r + " ");
            }
        } else if ("S".equals(args[0])) {
            String[] input = new String[args.length - 1];
            for (int i = 0; i < args.length; ++i) {

                input[i - 1] = args[i];
            }
            List<String> result = filter(input, new StringFilter());
            for (String r : result) {
                System.out.print(r + " ");
            }
        }
    }
}
