package encryptdecrypt;
import java.util.Scanner;
public class Main {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String pText, int key){
        pText = pText.toLowerCase();
        StringBuilder newPhrase = new StringBuilder();

        String custom = alphabet.substring(0,key);

        //String builder
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        sb.replace(26,26,custom);
        sb.delete(0,key);

        for (int i = 0; i < pText.length(); i++) {
            int charIndex
                    = alphabet.indexOf(pText.charAt(i));
            if (charIndex == -1) {
                newPhrase.append(pText.charAt(i));
            }
            else {
                char newChar = sb.charAt(charIndex);
                newPhrase.append(newChar);
            }
        }
        return newPhrase.toString();
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String plain = scan.nextLine();

        int Key = scan.nextInt();

        String cipherText = encrypt(plain, Key);

        System.out.println(cipherText);


    }
}
