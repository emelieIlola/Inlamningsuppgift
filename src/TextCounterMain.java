public class TextCounterMain {

    static void main(String[] args) {
        TextCounter textCount = new TextCounter();

        textCount.setAlText();
        String[] alText= textCount.getAlText();

        System.out.println();
        System.out.println("Your text is this: " + textCount.printAlText(alText));
        System.out.println();
        System.out.println("Your text contains this many rows: " + textCount.countRow(alText));
        System.out.println();
        System.out.println("Number of chars (including shift): " + textCount.countChar(alText));
        System.out.println();
        System.out.println("Number of words (stop is not included): " + textCount.countWords(alText));
        System.out.println();
        String[] longest = textCount.longestWord(alText);
        System.out.print("Your longest word/words is: ");
        for (int i = 0; i < longest.length; i++) {
            if (i< longest.length-1){
                System.out.print(longest[i] + " & ");
            }
            if (i == longest.length-1){
                System.out.println(longest[i]+".");
            }
        }
        System.out.println();

    }
}
