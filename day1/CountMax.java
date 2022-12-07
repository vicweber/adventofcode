import java.util.ArrayList;
import java.util.List;

public class CountMax {
    public static int getMax() {
        int sum = 0;
        List<Integer> sums = new ArrayList<>();

        List<String> li = ReadFile.getValues();

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

        return sums.stream().max(Integer::compare).get();
    }
}