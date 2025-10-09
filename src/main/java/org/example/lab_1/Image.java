package org.example.lab_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image implements Element {
    private String imageName;

    @Override
    public void print(){
        System.out.println("Image: " + imageName);
    }
}
