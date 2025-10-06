package org.example.lab_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);

        Image img1 = new Image("imageName1");
        Image img2 = new Image("imageName2");

        Paragraph par1 = new Paragraph("Paragraph text 1");
        Paragraph par2 = new Paragraph("Paragraph text 2");

        Table table1 = new Table("Table title 1");
        Table table2 = new Table("Table title 2");

        SubChapter subCh1 = new SubChapter("Subchapter1",
                List.of(img1, img2),
                List.of(par1, par2),
                List.of(table1, table2));

        SubChapter subCh2 = new SubChapter("Subchapter2",
                List.of(img1, img2),
                List.of(par1, par2),
                List.of(table1, table2));

        Chapter chapter1 = new Chapter("Chapter1", List.of(subCh1, subCh2));
        Chapter chapter2 = new Chapter("Chapter2", List.of(subCh1, subCh2));

        Book book1 = new Book("Book1",
                List.of(new Author("Jane"), new Author("Michael")),
                List.of(chapter1, chapter2),
                new TableOfContents());
        System.out.println(book1);
    }

}
