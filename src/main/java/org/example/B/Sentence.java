package org.example.B;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;

    public Sentence(String sentence) {
        words = new ArrayList<>();
        String[] wordArray = sentence.split("\\s+");
        for (String word : wordArray) {
            words.add(new Word(word));
        }
    }

    public int getWordCount() {
        return words.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Word word : words) {
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
}

