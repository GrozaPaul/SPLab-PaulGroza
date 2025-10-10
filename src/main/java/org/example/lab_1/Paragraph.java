package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paragraph implements Element {
    private String text;
    private AlignStrategy strategy;

    public Paragraph(String text) {
        this.text = text;
        this.strategy = new AlignLeft();
    }

    public Paragraph(AlignStrategy strategy) {
        this.strategy = strategy;
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(AlignStrategy strategy) {
        strategy.print(this.getText());
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
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
