package io.codelex.mysecondspringapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class TextController {

    TextService service;

    public TextController(TextService service) {
        this.service = service;
    }

    @PostMapping("/saveText")
    @CrossOrigin()
    public void saveText(@RequestBody String input) {
        this.service.saveText(input);
    }

    @GetMapping("/getSavedTexts")
    @CrossOrigin()
    public String getSavedTexts() {
        return this.service.getSavedTexts();
    }
}
