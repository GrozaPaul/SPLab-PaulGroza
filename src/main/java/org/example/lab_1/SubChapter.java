package org.example.lab_1;

import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SubChapter {
    private String name;
    private List<Element> elements;

    public SubChapter (String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
    }
}
