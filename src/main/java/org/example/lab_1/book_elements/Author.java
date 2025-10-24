package org.example.lab_1.book_elements;

import lombok.Data;

@Data
public class Author {
    private String name;

    public Author(String name){
        this.name = name;
    }

    public void print() {
        System.out.println("Authors:\nAuthor: " + this.name);
    }
}
