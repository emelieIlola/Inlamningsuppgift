import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextCounterTest {

 /*   @Test
    void testCountChar(){
        TextCounter textCount = new TextCounter();
        textCount.countChar("hej! & räksmörgås:-)");
        assertEquals("20", textCount.countChar("hej! & räksmörgås:-)"));
    }

    @Test
    void testCountCharIfCharZero(){
        TextCounter textCount = new TextCounter();
        textCount.countChar("");
        assertEquals("Null is not exepted. You must wright something.", textCount.countChar(""));
    }

  */
    @Test
    void testCountRow(){
        TextCounter textCount = new TextCounter();
        String[] allText = {"=)", "hej på dig", "vad heter du 123?", "räksmörgås!"};
        assertEquals(4, textCount.countRow(allText));
    }
    @Test
    void testCountRowIfCharZero(){
        TextCounter textCount = new TextCounter();
        String[] allText = {};
        assertEquals(0, textCount.countRow(allText));
    }
    @Test
    void testCountWord() {
        TextCounter textCount = new TextCounter();
        String[] allText = {"hej", "APA123", " heter Emelie! "};
        textCount.countWords(allText);
        assertEquals(0, textCount.countWords(allText));
    }
    @Test
    void testCountCharInAlText(){
        TextCounter textCount = new TextCounter();
        String[] allText = {"hej", "APA123", "heter Emelie!"};
        textCount.countChar(allText);
        assertEquals(23, textCount.countChar(allText));
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
