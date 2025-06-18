import java.util.Scanner;
//
public class Student_Grade{
    static String[] TheNames = new String[3];//only 3 students will be accepted in this prgram
    static int[] TheGrades = new int[3];
    static int ThereCount ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add new Student");
            System.out.println("2. Search Student");
            System.out.println("3. Show report");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    Add_student(input);
                    break;
                case 2:
                    Search_Student(input);
                    break;
                case 3:
                    Reports();
                    break;
                case 4:
                    System.out.println("You exited the system.");
                    return;
                default:
                    System.out.println("Please enter between 1 and 4.");
            }
        }
    }

    public static void Add_student(Scanner input) {
        if (ThereCount>= 3) {
            System.out.println("You are allowed to add only3 students.");
            return;
        }

        System.out.print("Enter the student's NA<Ee: ");
        String name = input.nextLine();

        System.out.print("Enter there grade : ");
        int grade = input.nextInt();
        input.nextLine();

        if (grade < 0 || name.length() < 3) {
            System.out.println("Make sure to put a right data .");
        } else {
            TheNames[ThereCount] = name;
            TheGrades[ThereCount] = grade;
            ThereCount++;
            System.out.println(name+" Joined 👏" );
        }
    }

    public static void Search_Student(Scanner input) {
        System.out.print("Enter student name to search: ");
        String nameToSearch = input.nextLine();

        for (int i = 0; i < ThereCount; i++) {
            if (TheNames[i].equalsIgnoreCase(nameToSearch)) {
                System.out.println("we have : " + TheNames[i] +"  in the system and  -  there Grade is : " + TheGrades[i]);
                return;
            }
        }
    }

    public static void Reports() {
        if (ThereCount< 3) {
            System.out.println("you shuld add three student to see the report of them all.");
            return;
        }

        int sum = 0;
        int highest = TheGrades[0];
        int lowest = TheGrades[0];

        for (int i = 0; i < ThereCount; i++) {
            int grade = TheGrades[i];
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = (double) sum / ThereCount;//type casting to double عشان النسبة%

        System.out.println("The student Average is: " + average);
        System.out.println("The students Highest grade is : " + highest);
        System.out.println("The L_L_L_Lowest GRADE is : " + lowest);
    }
}