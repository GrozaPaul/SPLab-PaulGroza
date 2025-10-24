package org.example.lab_1.book_elements;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AlignCenter implements AlignStrategy{
    @Override
    public void print(String text) {
        int width = 40;
        int padding = (width - text.length()) / 2;
        System.out.printf("%" + padding + "s%s%" + padding + "s|%n", "", text, "");
    }
}
