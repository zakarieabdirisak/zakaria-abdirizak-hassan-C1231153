import java.util.Scanner;

public class Prime_Checker {
    public static void main(String[] args) {

        int num;
        int count=0;
        System.out.println("Enter a number to see whether it's a Prime number Or Not:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for (int i=1; i<+num; i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(num+"   Is a not Prime number");
        }
        else {
            System.out.println(num+"    Is  a prime number.");
        }



    }
}