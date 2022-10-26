package io.codelex.mysecondspringapp.text;

import org.springframework.stereotype.Service;

@Service
public class TextService {

    TextRepository repository;

    public TextService(TextRepository mainRepository) {
        this.repository = mainRepository;
    }

    public void saveText(String input) {
        this.repository.saveText(input);
    }


    public String getSavedTexts() {
        return this.repository.getSavedTexts();
    }

}
