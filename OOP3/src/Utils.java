import java.util.ArrayList;

import static java.lang.Math.abs;

public class Utils {

    public static void PrintStatistics(ArrayList<Resource> operations) {
        int totalSum = 0;
        int marksCount = 0;
        int target = 160;

        ArrayList<Integer> marks = new ArrayList<>();

        for (Resource op : operations) {
            totalSum += op.value;
            if (totalSum >= target * (marksCount + 1)) {
                marks.add(op.id - 1);
                marksCount++;
            }
        }

        if (totalSum >= 0) System.out.println("--Total consum: " + totalSum + "--");
        else System.out.println("--Total income: " + abs(totalSum) + "--");
        System.out.println("Marks: " + marks);
        System.out.println();

    }

    public static void printAllInfo(ArrayList<Resource> list) {
        System.out.println("---All elements---");
        for (Resource el : list) {
            el.printInfo();
        }
        System.out.println();
    }


}
