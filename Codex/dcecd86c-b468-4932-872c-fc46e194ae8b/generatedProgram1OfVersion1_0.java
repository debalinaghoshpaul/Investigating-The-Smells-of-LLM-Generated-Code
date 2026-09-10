import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    private static final int MAX_DEPTH = 2;
    private Set<String> visitedUrls = new HashSet<>();
    private ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        WebCrawler webCrawler = new WebCrawler();
        webCrawler.startCrawling("https://www.example.com", 0);
    }

    public void startCrawling(String url, int depth) {
        if (depth > MAX_DEPTH || visitedUrls.contains(url)) {
            return;
        }

        visitedUrls.add(url);

        executor.execute(() -> {
            try {
                System.out.println("Crawling: " + url);
                
                URL websiteUrl = new URL(url);
                String content = HtmlParser.getContent(websiteUrl);

                if (content != null) {
                    Set<String> links = extractLinks(content);
                    for (String link : links) {
                        startCrawling(link, depth + 1);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private Set<String> extractLinks(String content) {
        Set<String> links = new HashSet<>();
        Pattern pattern = Pattern.compile("<a[^>]+href=['\"](.*?)['\"][^>]*>");
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            links.add(matcher.group(1));
        }

        return links;
    }

    public void shutdown() {
        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class HtmlParser {
    public static String getContent(URL url) throws IOException {
        // Implement method to fetch content from URL
        return null;
    }
}