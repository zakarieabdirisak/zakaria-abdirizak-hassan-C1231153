import java.util.Scanner;

public class Random_password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("                      Generating a Random Password");
        System.out.println("How long you want your password to be?: ");
        int lenght = input.nextInt();
        for (int i = 0; i<lenght; i++){
            int charach = (int)(Math.random()*93+33);//using ASCII code numbers...
            char chch = (char) charach;

            System.out.print(chch);


        }

    }
}