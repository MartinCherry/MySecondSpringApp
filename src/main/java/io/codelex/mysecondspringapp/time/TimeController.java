package io.codelex.mysecondspringapp.time;

import io.codelex.mysecondspringapp.text.TextService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TimeController {

    TimeService service;

    public TimeController(TimeService service) {
        this.service = service;
    }

    @GetMapping("/getTime")
    @CrossOrigin()
    public String getTime() {
        return service.getTime();
    }


}
