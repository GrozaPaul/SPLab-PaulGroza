package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table implements Element{
    private String title;

    @Override
    public void print() {
        System.out.println("Table: " + title);;
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Unsupported Operation on " + this.getClass());
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Unsupported Operation on " + this.getClass());
    }

    @Override
    public Element getElement(int index) {
        throw new UnsupportedOperationException("Unsupported Operation on " + this.getClass());
    }
}
