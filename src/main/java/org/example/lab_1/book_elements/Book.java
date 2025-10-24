package org.example.lab_1.book_elements;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Book {
    private String title;
    private List<Author> authorList;
    private List<Element> elements;

    public Book(String title, List<Author> authorList, List<Element> elements) {
        this.title  = title;
        this.authorList = authorList;
        this.elements = new ArrayList<>(elements);
    }

    public Book(String title){
        this.title = title;
        this.authorList = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public void add(Element element) {
        if (elements == null) elements = new ArrayList<>();
        elements.add(element);
    }

    public void addAuthor(Author author){
        if(authorList == null) this.authorList = new ArrayList<>();
        authorList.add(author);
    }

    public void print() {
        System.out.println("Book title: " + title);
        for(Author author: authorList) author.print();
        for(Element e: elements) e.print();

    }

}
