package org.example.B;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> sentences;

    public Paragraph(String paragraph) {
        sentences = new ArrayList<>();
        String[] sentenceArray = paragraph.split("(?<=[.!?])\\s+");
        for (String sentence : sentenceArray) {
            sentences.add(new Sentence(sentence));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }
}

