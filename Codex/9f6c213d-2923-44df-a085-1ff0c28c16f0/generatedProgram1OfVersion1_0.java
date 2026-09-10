// Searchable interface
interface Searchable {
    void search(String keyword);
}

// Document class implementing Searchable interface
class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if(content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the document");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document");
        }
    }
}

// WebPage class implementing Searchable interface
class WebPage implements Searchable {
    private String url;
    
    public WebPage(String url) {
        this.url = url;
    }
    
    @Override
    public void search(String keyword) {
        // Assume we are searching on the webpage content from the URL
        System.out.println("Searching for keyword '" + keyword + "' on webpage: " + url);
        // Perform search on webpage content and display result
    }
}

public class SearchTest {
    public static void main(String[] args) {
        Document doc = new Document("This is a sample document for testing search functionality");
        WebPage webpage = new WebPage("https://www.example.com");
        
        doc.search("sample");
        webpage.search("testing");
    }
}
