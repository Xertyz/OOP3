import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataProcessor<T> {
    public static void filterByCondition(ArrayList<Resource> list) {
        System.out.println("-----Sorting-----");
        List<Resource> filteredList = list.stream()
                .filter(el -> el.value > 20 && el.value < 80 && el.getClass().getName().equals("ResConsumption"))
                .sorted((a, b) -> {
                    return Integer.compare(a.value, b.value);
                })
                .limit(4)
                .toList();

        for (Resource el : filteredList) el.printInfo();

        System.out.println();
    }

    public static void findByValue(Integer value, ArrayList<Resource> list) {
        System.out.println("---Searching " + value + "---");
        Optional<Resource> neededEl = list.stream()
                .filter(el -> el.value == value)
                .findFirst();

        if (neededEl.isPresent()) neededEl.get().printInfo();
        else System.out.println("No such element found");

        System.out.println();
    }

}
