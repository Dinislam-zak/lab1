package ru.itis.inf304;

public class Element {
    public Integer value;
    public Element next;

    public int index;
    public Element(int value, int index) {
        this.value = value;
        this.index = index;
    }
}