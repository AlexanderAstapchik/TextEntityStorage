package com.company.text;

import java.io.Serializable;
import java.util.Random;

public class TextEntity implements Serializable, Comparable<TextEntity> {
    private int serialNumber;
    private String text;

    public TextEntity() {
        Random random = new Random();
        this.serialNumber = random.nextInt(4) + 1;
        switch (serialNumber) {
            case 1:
                this.text = "firstText";
                break;
            case 2:
                this.text = "secondText";
                break;
            case 3:
                this.text = "thirdText";
                break;
            case 4:
                this.text = "fourthText";
                break;
            case 5:
                this.text = "fifthText";
                break;
        }
    }


    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int compareTo(TextEntity textEntity) {
        return this.serialNumber - textEntity.serialNumber;
    }

    public String toString() {
        return "{" + serialNumber +
                ", " + text + '}';
    }

}

