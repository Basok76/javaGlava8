package org.example.B;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TextProcessor {
    private List<Paragraph> paragraphs;

    public TextProcessor(String text) {
        paragraphs = new ArrayList<>();
        String[] paragraphArray = text.split("\\n+");
        for (String paragraph : paragraphArray) {
            paragraphs.add(new Paragraph(paragraph));
        }
    }

    public List<Sentence> getAllSentencesSortedByWordCount() {
        List<Sentence> allSentences = new ArrayList<>();
        for (Paragraph paragraph : paragraphs) {
            allSentences.addAll(paragraph.getSentences());
        }
        allSentences.sort(Comparator.comparingInt(Sentence::getWordCount));
        return allSentences;
    }
}
