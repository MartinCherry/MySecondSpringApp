package io.codelex.mysecondspringapp.text;

import io.codelex.mysecondspringapp.text.server.TextServer;
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
