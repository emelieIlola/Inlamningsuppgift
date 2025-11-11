import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextCounterTest {

    @Test
    void testCountChar(){
        TextCounter textCount = new TextCounter("");
        textCount.countChar("hej! & räksmörgås:-)");
        assertEquals("20", textCount.countChar("hej! & räksmörgås:-)"));
    }
    @Test
    void testCountCharIfCharZero(){
        TextCounter textCount = new TextCounter("");
        textCount.countChar("");
        assertEquals("Null is not exepted. You must wright something.", textCount.countChar(""));
    }
    @Test
    void testCountRow(){
        TextCounter textCount = new TextCounter("");
        textCount.countChar("");
        assertEquals("", textCount.countChar(""));
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
