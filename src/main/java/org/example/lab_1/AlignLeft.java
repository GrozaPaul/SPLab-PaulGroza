package org.example.lab_1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AlignLeft implements AlignStrategy{
    @Override
    public void print(String text) {
        System.out.printf("%-40s|%n", text);
    }
}
