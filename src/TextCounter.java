import java.util.Scanner;

public class TextCounter {
    String[] alText;


    public TextCounter() {
        this.alText = alText;

    }

    public int countChar(String[] alText) {
        int numberOfChars = 0;


        if (alText.length == 0) {
            System.out.println("You didn't write anything.");
            return -1;
        }

        String allTextInOneString = "";

        for (int i = 0; i < alText.length; i++) {
            allTextInOneString += alText[i];
        }
        for (int i = 0; i < allTextInOneString.length(); i++) {
            numberOfChars++;
        }
        return numberOfChars;
    }

    public int countRow(String[] alText) {
        int numberOfRows = 0;
        if (alText.length == 0) {
            System.out.println("You didn't write anything.");
            return 0;
        }
        for (int i = 0; i < alText.length; i++) {
            numberOfRows++;
        }
        return numberOfRows;

    }

    public int countWords(String[] allText) {
        int numberOfWords = 0;

        for (int i = 0; i < allText.length; i++) {
            String rows = allText[i];
            // System.out.println("raden är: " + rows);
            String[] words = rows.split("\\s+");   //filtrerar bort flera mellanslag till ett
            for (int j = 0; j < words.length; j++) {
                //System.out.println("ordet är " + words[j]);
                String word = words[j];
                if (!word.isEmpty()) {
                    numberOfWords++;
                }
            }
        }
        return numberOfWords;
    }

    public String printAlText(String[] alText) {
        String alTextAsOne = "";

        for (int i = 0; i < alText.length; i++) {
            String row = alText[i];
            alTextAsOne += row + " ";
            //System.out.println(alTextAsOne);
        }
        return alTextAsOne;
    }

    public String[] longestWord(String[] alText) {
        String[] arrLongestWord = new String[0];
        String longestWord = "";

        for (int i = 0; i < alText.length; i++) {
            String row = alText[i];

            // delar upp row i strängar där det finns en eller fler white space (mellanslag, radbyte, tab)
            String[] words = row.split("\\s+");

            //plocka ut varje ord ifrån ord-arrayen
            for (int j = 0; j < words.length; j++) {
                String word = words[j];

                //om ord avslutar med: . , ! ? --> Ta bort specialtecknet.
                if (word.length() > 0) {
                    char lastChar = word.charAt(word.length() - 1);
                    if (lastChar == '.' || lastChar == ',' || lastChar == '!' || lastChar == '?') {
                        //skapar en char-array för att kunna ta bort sista tecknet
                        char[] arrChar = new char[word.length() - 1];
                        for (int k = 0; k < arrChar.length; k++) {
                            arrChar[k] = word.charAt(k);
                        }
                        //skapar en ny String från arrayen
                        word = "";
                        for (int l = 0; l < arrChar.length; l++) {
                            word += arrChar[l];
                        }
                    }
                }
                // jämför längd
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                    //System.out.println(word);
                    arrLongestWord = new String[]{word};
                } else if (word.length() == longestWord.length()) {
                    String[] temp = new String[arrLongestWord.length + 1];  //skapar en ny större array
                    for (int k = 0; k < arrLongestWord.length; k++) {
                        temp[k] = arrLongestWord[k];
                    }
                    temp[temp.length - 1] = word;  // lägg in nya ordet sist.
                    arrLongestWord = temp;
                }
            }
        }
        return arrLongestWord;
    }

    //alText[]=varje rad sparas på ett index.
    public void setAlText() {
        Scanner scan = new Scanner(System.in);

        //stop måste skrivas på en egen rad utan nån annan text
        System.out.println("Write some text. Use how many rows you like. Write STOP to finish. ");
        // startar med en tom array
        String[] alText = new String[0];

        while (true) {
            String text = scan.nextLine(); //läser in en rad från användaren.

            // Delar upp texten i en array av ord
            String[] word = text.split(" ");
            String rowToSave = "";      //Raden som ska sparas
            boolean findStop = false;

            for (int i = 0; i < word.length; i++) {
                if (word[i].equalsIgnoreCase("STOP")) {
                    findStop = true;
                    break;
                }
                if (rowToSave.length() > 0) {      //lägger till mellanslag mellan ordet.
                    rowToSave += " ";
                }
                rowToSave += word[i];
            }

            if (rowToSave.length() > 0) {
                String[] temp = new String[alText.length + 1];
                for (int i = 0; i < alText.length; i++) {
                    temp[i] = alText[i];
                }
                // lägger till rowToSave på sista platsen i den nya arrayen som skapas med en storlek större i varje loop.
                temp[temp.length - 1] = rowToSave;
                //slutgiltiga arrayen, allText, uppdateras med att ha samma värde som temp-arrayen.
                alText = temp;
            }
            if (findStop) {
                break;
            }
        }
        this.alText = alText;
    }

    public String[] getAlText() {
        return alText;
    }
}



