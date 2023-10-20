import java.util.Scanner;

/**
 * UTS
 */
public class UTS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String languageName;
        String name = "";

        System.out.println("Welcome to Job Recruitment for Programmer");
        System.out.print("Enter your name : ");
        name = sc.nextLine();

        // testing employee in complex mathematical
        System.out.println("Solve the mathematical question on your paper!");
        System.out.print("How long did you finish your mathematical question? (In Minutes): ");
        int time = sc.nextInt();

        if (time < 180) {
            System.out.println();
            System.out.print("How many programming languages did you master ? : ");
            int language = sc.nextInt();

            for (int i = 1; i <= language; i++) {

                System.out.print("Enter your programming language : ");
                languageName = sc.next();
            }
            if (language < 3) {
                System.out.println("You are not eligible for the job");
                System.exit(0);
            } else {
                System.out.println();
                System.out.print("What is your degree in? : ");
                String degree = sc.next();

                if (degree.equals("D4") || degree.equals("S1")) {
                    System.out.println("What program in college do you study in? : ");
                    String program = sc.next();

                    if (program.equalsIgnoreCase("TeknikInformatika")
                            || program.equalsIgnoreCase("RekayasaPerangkatLunak")
                            || program.equalsIgnoreCase("IlmuKomputer")
                            || program.equalsIgnoreCase("SistemInformasi")) {

                        System.out.println("How many work experience do you have? (Months): ");
                        int experience = sc.nextInt();

                        if (experience >= 12) {
                            System.out.println();
                            System.out.println("Thank you " + name);
                            System.out.println("You are eligible for the job");
                            System.exit(0);
                        } else {
                            System.out.println("You are not eligible for the job");
                            System.exit(0);
                        }

                    } else {
                        System.out.println("You are not eligible for the job");
                        System.exit(0);
                    }

                } else {
                    System.out.println("You are not eligible for the job");
                    System.out.println("Get a real Degree!");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("You are not eligible for the job");
            System.exit(0);
        }

    }
}