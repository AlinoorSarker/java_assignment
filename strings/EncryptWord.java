package strings;

public class EncryptWord {

    public static void main(String[] args) {
        String word = "ROADTOSDET";
        String encryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A') {
                encryptedWord += 'F';
            } else {
                encryptedWord += ch;
            }
        }
        System.out.println("Encrypted word: " + encryptedWord);
    }
}

