import java.util.Scanner;

public class TextCounterMain {

    static void main(String[] args) {
        TextCounter textCount = new TextCounter();

        String[] alText = new String[0];  // startar med en tom array

        textCount.setAlText();
        alText= textCount.getAlText();
        System.out.println();
        System.out.println("Your text is this: " + textCount.printAlText(alText));
        System.out.println();
        System.out.println("Your text contains this many rows: " + textCount.countRow(alText));
        System.out.println("Number of chars (including shift): " + textCount.countChar(alText));
        System.out.println("Number of words (stop is not included): " + textCount.countWords(alText));
        String[] longest = textCount.longestWord(alText);
        System.out.print("Your longest word is: ");
        for (int i = 0; i < longest.length; i++) {
            System.out.print(longest[i] + " ");
        }
        textCount.getAlText();

    }
}
