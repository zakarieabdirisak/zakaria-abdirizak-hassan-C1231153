import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        char magac_hore;
        char magac_danbe;
        System.out.println("enter any thing!");
        Scanner input = new Scanner(System.in);
        String plidrom = input.nextLine();
        while (true) {
            magac_hore = plidrom.charAt(0);
            magac_danbe = plidrom.charAt(plidrom.length() - 1);
            if (magac_hore == magac_danbe) {
                System.out.println(plidrom + " waa palindrome");
                plidrom = input.nextLine();

            } else {
                System.out.println(plidrom + " mahan palindrome");
                break;
            }
        }
    }
}
