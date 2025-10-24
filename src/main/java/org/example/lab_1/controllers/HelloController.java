package org.example.lab_1.controllers;

import lombok.RequiredArgsConstructor;
import org.example.lab_1.lab3components.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {
    private ClientComponent clientComponent;

    @GetMapping
    public String hello(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/clientComponent")
    public String helloFromClientComponent(){
        return clientComponent.toString();
    }
}
