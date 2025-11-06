import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextCounterTest {

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
}
