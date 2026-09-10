// Searchable.java
// Interface Searchable with a method search(String keyword)

interface Searchable {
    boolean search(String keyword);
}

// Document.java
// Class Document that implements the Searchable interface

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Document implements Searchable {

    private String content;

    public Document(String filePath) throws IOException {
        content = new String(Files.readAllBytes(Paths.get(filePath)));
    }

    @Override
    public boolean search(String keyword) {
        return content.toLowerCase().contains(keyword.toLowerCase());
    }
}

// WebPage.java
// Class WebPage that implements the Searchable interface

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

class WebPage implements Searchable {

    private String content;

    public WebPage(String url) throws IOException {
        content = new String(Files.readAllBytes(Paths.get(new URL(url).toURI())), Charset.defaultCharset());
    }

    @Override
    public boolean search(String keyword) {
        return content.toLowerCase().contains(keyword.toLowerCase());
    }
}

// Main.java
// Class Main that tests the Searchable interface

public class Main {

    public static void main(String[] args) throws IOException {
        Searchable document = new Document("document.txt");
        Searchable webPage = new WebPage("https://www.example.com");

        System.out.println(document.search("keyword"));
        System.out.println(webPage.search("keyword"));
    }
}
