public class TextCounter {
    String text;

    public TextCounter (String text){
        this.text = text;
    }

    public String setText(String newText) {
        text = newText;
        return text;
    }
}
