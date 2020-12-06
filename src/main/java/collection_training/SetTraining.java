package collection_training;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {
    public static void trainSet () {
        String name1 = "Sam";
        String name2 = "Megan";
        String name3 = "Lucas";
        Set<String> uniqueNames = new HashSet<>(); //implementacja zbioru ktory ma indywidulane elementy
        uniqueNames.add(name1);
        uniqueNames.add(name2);
        uniqueNames.add(name3);
        System.out.println(uniqueNames.size());
        uniqueNames.add(name1);
        System.out.println(uniqueNames.size());
    }
}
