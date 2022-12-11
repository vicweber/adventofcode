import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CountMax {
    public static List<Integer> sums = new ArrayList<>();
    public static List<String> li = ReadFile.getValues();
    public static int getMax() {
        int sum = 0;

        for (int i = 0; i < li.size(); i++) {
            if("".equals(li.get(i))) {
                sums.add(sum);
                sum=0;
            } else {
                int g = Integer.parseInt(li.get(i));
                sum += g;

                if (i == li.size() - 1) {
                    sums.add(sum);
                    sum=0;
                }
            }
        }
        Integer[] array = sums.stream().sorted(Integer::compare).toArray(Integer[]::new);

        Arrays.sort(array, Collections.reverseOrder());
        
        int sum1 = array[0];
        int sum2 = array[1];
        int sum3 = array[2];
        int sumOfThree = sum1 + sum2 + sum3;
        System.out.println(sumOfThree);

        return sums.stream().max(Integer::compare).get();
    }
}