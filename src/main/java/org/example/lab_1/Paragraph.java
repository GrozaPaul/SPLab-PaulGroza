package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Paragraph implements Element {
    private String text;

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
