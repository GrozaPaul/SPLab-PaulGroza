package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table implements Element{
    private String title;

    @Override
    public void print() {
        System.out.println("Table: " + title);
    }
}
