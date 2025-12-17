import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        int currentYear = 2025;
//        String usersDateOfBirth = "1990";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = " + ( currentYear - dateOfBirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//
//        System.out.println("The users says he`s "  + ( ageWithPartialYear + 0.1));

        int currentYear = 2025;

        try {
            System.out.println(getInputFromTheConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromTheConsole ( int currentYear){

        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");


        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner ( int currentYear){

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");


//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

}
