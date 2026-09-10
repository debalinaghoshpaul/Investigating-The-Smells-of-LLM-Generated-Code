    
    public static String compressString(String input) {
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        for(int i=0; i<input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1)) {
                count++;
            } else {
                result.append(input.charAt(i));
                result.append(count);
                count = 1;
            }
        }
        
        // Add the last character count
        result.append(input.charAt(input.length()-1));
        result.append(count);
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaaabbbbcccccddddeeee";
        String compressedString = compressString(input);
        System.out.println("Compressed String: " + compressedString);
    }

}