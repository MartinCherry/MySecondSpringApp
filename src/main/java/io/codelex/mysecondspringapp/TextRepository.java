package io.codelex.mysecondspringapp;

import io.codelex.mysecondspringapp.server.TextServer;
import org.springframework.stereotype.Repository;

@Repository
public class TextRepository {

    TextServer server = new TextServer();


    public void saveText(String input) {
        server.saveText(input);
    }

    public String getSavedTexts() {
        return server.getSavedTexts();
    }


}
