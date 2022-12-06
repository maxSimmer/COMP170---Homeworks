
import java.util.Scanner;
public class CaesarCipher {

    public static void main(String[] args) {
        decode();
    }
    public static void decode() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your message? ");
        String msg = scan.nextLine();
        System.out.println("Encoding key? ");
        int key = scan.nextInt();
        String msg2 = "";
        scan.close();

        for (int i = 0; i < msg.length(); i++) {
            char letter = msg.charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                letter = (char) (letter + key);
                if (letter > 'z') {
                    letter = (char) (letter + 'a' - 'z' - 1);
                }
                msg2 = msg2 + letter;
            } else if (letter >= 'A' && letter <= 'Z') {
                letter = (char) (letter + key);
                if (letter > 'Z') {
                    letter = (char) (letter + 'A' - 'Z' - 1);
                }
                msg2 = msg2 + letter;
            } else {
                msg2 = msg2 + letter;
            }
        }
        System.out.println("Your message: " + msg2.toUpperCase());
    }
}
