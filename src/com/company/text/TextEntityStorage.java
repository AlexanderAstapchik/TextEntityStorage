package com.company.text;

import java.io.Serializable;
import java.util.Arrays;

public class TextEntityStorage implements Serializable {
    TextEntity[] texts;


    public TextEntity[] getTexts() {
        return texts;
    }

    public void setTexts(TextEntity[] texts) {
        this.texts = texts;
    }

    public static void sort(TextEntity[] texts) {

    }


}
