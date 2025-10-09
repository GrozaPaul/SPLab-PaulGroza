package org.example.lab_1;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TableOfContents implements Element {

    @Override
    public void print() {}

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
