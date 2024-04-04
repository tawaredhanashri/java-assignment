public class DuplicateCharacters {
    
    public static void findDuplicates(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            if (currentChar == ' ') {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    System.out.println("Duplicate character found: " + currentChar);
                    
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "dhanashri ";
        System.out.println("Original string: " + inputString);
     
        findDuplicates(inputString);
    }
}
