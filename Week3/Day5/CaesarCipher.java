public class CaesarCipher {
    // Method to encrypt the text
    public static String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                // Shift the character and wrap around using modulo 26
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            encrypted.append(ch);
        }
        return encrypted.toString();
    }

    // Method to decrypt the text
    public static String decrypt(String text, int shift) {
        // Decryption is the inverse of encryption, so we use -shift
        return encrypt(text, 26 - shift);
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        int shift = 3;

        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
