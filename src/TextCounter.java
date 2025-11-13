public class TextCounter {
    String text;

    public TextCounter() {
        this.text = text;
    }

    public int countChar(String[] allText) {
        int numberOfChars = 0;


        if (allText.length == 0) {
            System.out.println("You didn't write anything.");
            return -1;
        }

        String allTextInOneString = "";

        for (int i = 0; i < allText.length; i++) {
            allTextInOneString += allText[i];
        }
        for (int i = 0; i < allTextInOneString.length(); i++){
            numberOfChars ++;
        }
        return numberOfChars;
    }

    public int countRow(String[] allText) {
        int numberOfRows = 0;
        if (allText.length == 0) {
            System.out.println("You didn't write anything.");
            return 0;
        }
        for (int i = 0; i < allText.length; i++) {
            numberOfRows++;
        }
        return numberOfRows;

    }

    public int countWords(String[] allText) {
        int numberOfWords = 0;
        for (int i = 0; i < allText.length; i++) {
            String rows = allText[i];
            System.out.println("raden är: " + rows);
            String[] words = rows.split(" ");
            for(int j =0;j<words.length;j++)
                System.out.println(words[i]);
         //  här slutade jag jobba torsd
            numberOfWords++;
        }
        return numberOfWords;
    }
}



