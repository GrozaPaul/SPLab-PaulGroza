package org.example.lab_1.book_elements;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element getElement(int index);
}
