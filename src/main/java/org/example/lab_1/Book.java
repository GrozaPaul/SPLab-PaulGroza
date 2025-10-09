package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Data
public class Book {
    private String title;
    private List<Author> authorList;
    private TableOfContents tableOfContents;
    private List<Chapter> chapterList;

    public Book(String title, List<Author> authorList, List<Chapter> chapterList, TableOfContents tableOfContents) {
        this.title  = title;
        this.authorList = authorList;
        this.chapterList = new ArrayList<>(chapterList);
        this.tableOfContents = tableOfContents;
    }

}
