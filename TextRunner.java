package HomeWork2.Capter4_A1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by klimenchukev on 16.10.2016.
 */
public class TextRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //input header
        List<Word> text = Sentence.createSentence(new Word(bufferedReader.readLine()));
        //input text
        for(int i = 0; i<4; i++) {
             text = Sentence.createSentence(new Word(bufferedReader.readLine()));
        }
        //bussines logic
        Text.printText(text);
        Text.addText(text, new Word("ThisIsNewWord"));
        Text.header(text);
    }
}
/*
      INPUT:
JAVA
Jenya
love
OOP
!

     OUTPUT:
JAVA Jenya love OOP !
ThisIsNewWord
This is header - JAVA
 */