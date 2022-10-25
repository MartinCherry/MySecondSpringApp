package io.codelex.mysecondspringapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {

    TextService service;

    public TimeController(TextService service) {
        this.service = service;
    }

    @GetMapping("/getTime")
    @CrossOrigin()
    public String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
    }


}
