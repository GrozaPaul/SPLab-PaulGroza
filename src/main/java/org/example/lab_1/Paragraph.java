package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paragraph implements Element {
    private String text;

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);;
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
