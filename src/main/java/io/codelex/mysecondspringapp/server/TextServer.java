package io.codelex.mysecondspringapp.server;

import java.util.ArrayList;
import java.util.List;

public class TextServer {


    List<String> savedTexts = new ArrayList<>();

    public void saveText(String input) {
        this.savedTexts.add(input);
    }

    public String getSavedTexts() {
        return String.join("; ", this.savedTexts);
    }

}
