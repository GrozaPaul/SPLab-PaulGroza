package org.example.lab_1;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    private List<Element> elements;

    public Section(String title, List<Element> elements) {
        this.title = title;
        this.elements = new ArrayList<>(elements);
    }

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for(Element e: elements) {
            e.print();
        }
    }

    @Override
    public void add (Element element) {
        this.elements.add(element);
    }

    @Override
    public void remove (Element element) {
        this.elements.remove(element);
    }

    @Override
    public Element getElement(int index) {
        return this.elements.get(index);
    }
}
