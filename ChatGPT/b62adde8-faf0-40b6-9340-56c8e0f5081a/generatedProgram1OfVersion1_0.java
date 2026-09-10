
public class WordPageNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, List<Integer>> wordPageMap = new HashMap<>();
        
        System.out.println("Enter pairs of word and page number (separated by space). Enter 'exit' to stop:");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("exit")) {
                break;
            }
            
            String[] pair = input.split(" ");
            String word = pair[0];
            int pageNumber = Integer.parseInt(pair[1]);
            
            List<Integer> pageNumbers = wordPageMap.getOrDefault(word, new ArrayList<>());
            pageNumbers.add(pageNumber);
            wordPageMap.put(word, pageNumbers);
        }
        
        System.out.println("Word : Page Numbers");
        for (Map.Entry<String, List<Integer>> entry : wordPageMap.entrySet()) {
            System.out.print(entry.getKey() + " : ");
            for (int pageNumber : entry.getValue()) {
                System.out.print(pageNumber + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}