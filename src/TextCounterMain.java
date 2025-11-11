import java.util.Scanner;

public class TextCounterMain {

     static void main(String[] args) {
        TextCounter textCount = new TextCounter("hej");


        Scanner scan = new Scanner(System.in);

        System.out.println("Wright som text. Use how many rows you like. Wright STOP to finish. ");

        while (true){
            String text = scan.nextLine();
            if(text.equals("STOP")){
                break;
            }
        }

        //System.out.println(textCount.setText("hejsan"));
    }



}
