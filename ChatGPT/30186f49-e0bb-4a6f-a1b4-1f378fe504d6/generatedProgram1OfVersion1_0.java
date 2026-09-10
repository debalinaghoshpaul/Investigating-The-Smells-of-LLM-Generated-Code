
public class ReplaceHate {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = br.readLine();
            String newLine = line.replaceFirst("hate", "love");

            br.close();

            FileWriter writer = new FileWriter("output.txt");
            writer.write(newLine);
            writer.close();

            System.out.println("Word replaced successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
} 

In this program, we first read the line of text from the file 'input.txt'. We then use the `replaceFirst()` method to replace the first occurrence of 'hate' with 'love'. The updated line is then written to the 'output.txt' file.