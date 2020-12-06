package collection_training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTraining {

    public static void TrainList() {
        String name1 = "Samantha";
        String name2 = "Zarina";
        String name3 = "John";

        //impelentjaja listy typowo names nazwa zmiennej = incnalouzemy liste
//        ArrayList<String> names = new ArrayList<>(); //z prawej pusty <> bo java sie skpanie ze z lewej String w <> to tu tez
        List<String> names = new LinkedList<>();
//        List<String> names = new ArrayList<>(); // to samo co wyzej, moze byc list
        names.add(name1);
        names.add(name2);
        names.add(name3);
        System.out.println(names.size());
        names.add(name1);
        System.out.println(names.size());

    }
}
