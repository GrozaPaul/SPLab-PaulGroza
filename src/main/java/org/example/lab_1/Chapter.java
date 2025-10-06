package org.example.lab_1;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public Chapter (String name, List<SubChapter> subChapterList) {
        this.name = name;
        this.subChapterList = new ArrayList<>(subChapterList);
    }
}
