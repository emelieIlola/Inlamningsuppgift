public class TextCounter {
    String text;

    public TextCounter (String text){
        this.text = text;
    }

    public String setText(String newText) {
        text = newText;
        return text;
    }

    public String countChar(String text) {
        int chars = 0;
        if (text.length()==0) {
            return "Null is not exepted. You must wright something.";
        }
        for (int i = 0; i<text.length(); i++){
               chars++;
           }
        return String.valueOf(chars);
    }
}
