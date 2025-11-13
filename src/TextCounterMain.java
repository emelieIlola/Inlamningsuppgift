import java.util.Scanner;

public class TextCounterMain {

    static void main(String[] args) {
        TextCounter textCount = new TextCounter();

        Scanner scan = new Scanner(System.in);

        System.out.println("Wright som text. Use how many rows you like. Wright STOP to finish. "); //stop måste skrivas på en egen rad utan nån annan text

        String[] allText = new String[0];  // startar med en tom array

        while (true) {
            String text = scan.nextLine(); //läser in en rad från användaren.

            String[] word = text.split(" "); // Delar upp texten i en array av ord
            String rowToSave = "";      //Raden om ska sparas
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

            //System.out.println(word.length);
            //System.out.println(rowToSave);

            if (rowToSave.length() > 0) {
                String[] temp = new String[allText.length + 1];
                for (int i = 0; i < allText.length; i++) {
                    temp[i] = allText[i];
                }
                temp[temp.length - 1] = rowToSave;   // lägger till rowToSave på sista platsen i den nya arrayen som skapas med en storlek större i varje loop.
                allText = temp;             //slutgiltiga arrayen, allText, uppdateras med att ha samma värde som temp-arrayen.
            }

            if (findStop) {
                break;
            }

        }
        System.out.println("Your text contains this many rows: " + textCount.countRow(allText));
/*
        String allTextInOneString = "";
        for (int i = 0; i < allText.length; i++) {
            allTextInOneString = allText[i] + " ";
            System.out.println(allTextInOneString);
        }
  */
        //System.out.println("your text contain this many chars (including shift): " + textCount.countChar(allTextInOneString));
        System.out.println("number of chars (including shift): " + textCount.countChar(allText));
        System.out.println("number of words: " + textCount.countWords(allText));
    }
}
