package org.example.lab_1;

import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SubChapter {
    private String name;
    private List<Image> imageList;
    private List<Paragraph> paragraphList;
    private List<Table> tableList;

    public SubChapter (String name, List<Image> imageList, List<Paragraph> paragraphList, List<Table> tableList) {
        this.name = name;
        this.imageList = new ArrayList<>(imageList);
        this.paragraphList = new ArrayList<>(paragraphList);
        this.tableList = new ArrayList<>(tableList);
    }
}
