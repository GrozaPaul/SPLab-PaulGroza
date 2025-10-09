package org.example.lab_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);

        SubChapter subCh1 = new SubChapter("Chapter I");
        subCh1.addElement(new Paragraph("Para1"));
        subCh1.addElement(new Image("img1"));
        subCh1.addElement(new Table("Table1"));

        SubChapter subCh2 = new SubChapter("Chapter II");
        subCh1.addElement(new Paragraph("Para2"));
        subCh1.addElement(new Image("img2"));
        subCh1.addElement(new Table("Table2"));

        Chapter chapter1 = new Chapter("Chapter1", List.of(subCh1, subCh2));
        Chapter chapter2 = new Chapter("Chapter2", List.of(subCh1, subCh2));

        Book book1 = new Book("Book1",
                List.of(new Author("Jane"), new Author("Michael")),
                List.of(chapter1, chapter2),
                new TableOfContents());
        System.out.println(book1);
    }
}
