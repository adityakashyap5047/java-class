public class CountSpecialChar {
    
    public static void main(String[] args) {
        String text = "Hello@World#2024!";
        int specialCharCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        System.out.println("Number of special characters: " + specialCharCount);
    }
}
