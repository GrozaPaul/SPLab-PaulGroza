package org.example.lab_1.book_elements;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image implements Element {
    private String imageName;

    @Override
    public void print(){
        System.out.println("Image: " + imageName);;
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
