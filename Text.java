package HomeWork2.Capter4_A1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by klimenchukev on 16.10.2016.
 */
public class Text {

    public static void addText(List<Word> list, Word word) {
        list.add(word);
        System.out.println();
        System.out.println(word);
    }

    public static void printText(List<Word> list) {
        String text = "";
        for (Word word : list) {
            System.out.print(word + " ");
        }
    }

    public static void header(List<Word> list) {
        System.out.println("This is header - " + list.get(0));
    }

}

