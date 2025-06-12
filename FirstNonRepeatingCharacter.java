public class FirstNonRepeatingCharacter {
    
    public static void main(String[] args) {
        String str = "swiss";
        char result = '\0';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                result = c;
                break;
            }
        }
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
