package collection_training;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {
    public static void mapTrain() {
        String name1 = "Sam";
        String name2 = "Clover";
        String name3 = "Alex";
        //tworyzmy intefrejs Map
        Map<Integer, String> names = new HashMap<>(); //przechowuj l calk i String czyli imiona np
        names.put(1, name1);
        names.put(2, name2);
        names.put(3, name3);
        printMap(names);
        System.out.println(names.size());
        names.put(2, name1);
        printMap(names);
        System.out.println(names.size());
    }

    public static void printMap(Map<Integer, String> mapNames) {
        for (Map.Entry<Integer, String> entry: mapNames.entrySet()) { //foreach map entry
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
    }
}
