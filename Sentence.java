package HomeWork2.Capter4_A1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by klimenchukev on 16.10.2016.
 */
public class Sentence {

    public static List<Word> sentence = new ArrayList<>();

    public static List<Word> createSentence( Word word) {

        sentence.add(word);
        return sentence;
    }

    public Sentence(List<Word> sentence) {
        this.sentence = sentence;
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }

}


