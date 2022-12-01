import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opCount = 0;
        ArrayList<Resource> resources = new ArrayList<>(Arrays.asList(
                new Worker("Billy"),
                new ResIncome(14, 30)
        ));

        while (true) {
            String value = scanner.next();
            if (value.equals("break")) {
                break;
            } else {
                try {
                    int num = Integer.parseInt(value);
                    if (num >= 0) {
                        resources.add(new ResConsumption(opCount, num));
                    } else {
                        resources.add(new ResIncome(opCount, num));
                    }
                    opCount++;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong value, it's skipped");
                }
            }
        }

        Utils.printAllInfo(resources);
        Utils.PrintStatistics(resources);

        DataProcessor.filterByCondition(resources);
        DataProcessor.findByValue(40, resources);

    }
}
