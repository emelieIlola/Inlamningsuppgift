import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCounterTest {

    @Test
    void testCountRow() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"=)", "hej på dig", "vad heter du 123?", "räksmörgås!"};
        assertEquals(4, textCount.countRow(alText));
    }

    @Test
    void testCountRowIfCharZero() {
        TextCounter textCount = new TextCounter();
        String[] alText = {};
        assertEquals(0, textCount.countRow(alText));
    }

    @Test
    void testCountWord() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"hej", "APA123", "heter Emelie ", "!", "()"};
        textCount.countWords(alText);
        assertEquals(6, textCount.countWords(alText));
    }
    @Test
    void testCountWordIfWordIsOnlyShift() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"  hej", "APA123", "sol  moln  ", "    "};
        textCount.countWords(alText);
        assertEquals(4, textCount.countWords(alText));
    }
    @Test
    void testCountCharInAlText() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"hej", "APA123", "heter Emelie!"};
        textCount.countChar(alText);
        assertEquals(22, textCount.countChar(alText));
    }
    @Test
    void testPrintAlText() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"hej, vad heter du?", "Jag heter Emelie.", "solen skiner!"};
        textCount.printAlText(alText);
        assertEquals("hej, vad heter du? Jag heter Emelie. solen skiner! ", textCount.printAlText(alText));
    }
    @Test
    void testPrintOnlyTheLongestWordFromAlText() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"hej, vad heter du? ", "Jag heter Emelie. ", "solen skiner!"};
        String[] arrLongestWord = textCount.longestWord(alText);

        assertEquals(2, arrLongestWord.length);
        assertEquals("Emelie", arrLongestWord[0]);
        assertEquals("skiner", arrLongestWord[1]);
    }
    @Test
    void testIfLongestWordEndsWithSpecialCharacter() {
        TextCounter textCount = new TextCounter();
        String[] alText = {"hej, vad heter du? ", "Jag heter Emelie. ", "solen skiner!"};
        String[] arrLongestWord = textCount.longestWord(alText);
        assertEquals(2, arrLongestWord.length);
        assertEquals("Emelie", arrLongestWord[0]);
        assertEquals("skiner", arrLongestWord[1]);
    }


   /* @Test
    void testSetAndGetAlText() {
       TextCounter textCount = new TextCounter();
       String[] alText;
       String text = "Hej, vad heter du? Jag heter Emelie.";
       textCount.setAlText(text);
       textCount.getAlText();
       System.out.println(alText[0]);

       assertEquals(2, alText[0]);
   }@Test
    void testGetUserInput(){
        TextCounter textCount = new TextCounter();
        textCount.userInput();
        String[] alText = new String[0];
        assertEquals(9, alText.length);
    }
    /*
    @Test
    void testTextCounterSetText(){
        TextCounter textCount = new TextCounter("");
        textCount.setText("hejsan");
        assertEquals("hejsan", textCount.setText("hejsan"));
    }

    @Test
    void test(){
        TextCounter textCount = new TextCounter("");
        textCount.setText("hejsan");
        assertEquals("hejsan", textCount.setText("hejsan"));
    }

     */
}
