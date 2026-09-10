import java.io.*;
import java.util.Scanner;

public class Exercise21_05 {
  public static void main(String[] args) throws IOException {
    // Check command line argument length
    if (args.length != 2) {
      System.out.println("Usage: java Exercise21_05 <input file> <output file>");
      System.exit(1);
    }

    // Open the input and output files
    File inputFile = new File(args[0]);
    File outputFile = new File(args[1]);

    // Check if input file exists
    if (!inputFile.exists()) {
      System.out.println("Error: Input file not found!");
      System.exit(2);
    }

    // Create a scanner for the input file
    Scanner input = new Scanner(inputFile);

    // Create a print writer for the output file
    PrintWriter output = new PrintWriter(outputFile);

    // Write the HTML header to the output file
    output.println("<html>");
    output.println("<head>");
    output.println("<title>Java Source Code</title>");
    output.println("<style>");
    output.println("body {");
    output.println("font-family: monospace;");
    output.println("}");
    output.println("span.keyword {");
    output.println("color: navy;");
    output.println("font-weight: bold;");
    output.println("}");
    output.println("span.comment {");
    output.println("color: green;");
    output.println("}");
    output.println("span.literal {");
    output.println("color: blue;");
    output.println("}");
    output.println("</style>");
    output.println("</head>");
    output.println("<body>");

    // Read each line from the input file
    while (input.hasNextLine()) {
      String line = input.nextLine();

      // Highlight keywords, comments, and literals in the line
      line = line.replaceAll("\\b(public|private|protected|class|interface|extends|implements|abstract|static|final|transient|volatile|synchronized|native|strictfp)\\b", "<span class=\"keyword\">$1</span>");
      line = line.replaceAll("//.*", "<span class=\"comment\">$0</span>");
      line = line.replaceAll("\".*\"", "<span class=\"literal\">$0</span>");
      line = line.replaceAll("'.*'", "<span class=\"literal\">$0</span>");

      // Write the highlighted line to the output file
      output.println(line);
    }

    // Write the HTML footer to the output file
    output.println("</body>");
    output.println("</html>");

    // Close the input and output files
    input.close();
    output.close();

    System.out.println("Java file converted to HTML file successfully.");
  }
}
