class Solution {
    public String convertToTitle(int columnNumber) {
        // Ek empty string builder banate hain output ko store karne ke liye
        StringBuilder Output = new StringBuilder();

        // Jab tak columnNumber positive hai, loop chalao
        while (columnNumber > 0) {
            // columnNumber ko 1 se kam karte hain
            columnNumber--;

            // Current character nikalte hain by modulo of columnNumber by 26
            char c = (char) (columnNumber % 26 + 'A');

            // columnNumber ko 26 se divide karte hain
            columnNumber /= 26;

            // Character ko output me append karte hain
            Output.append(c);
        }

        // Output string ko reverse karte hain
        // Kyunki characters ko right se left find kiya hai
        Output.reverse();

        // Reversed string ko return karte hain
        return Output.toString();
    }
}
