import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;


       while (counter <= 5){
           System.out.println("Enter number #" + counter + ":");
           String nextNumber = scanner.nextLine();
           try{
               double number = Double.parseDouble(nextNumber);
               counter++;
               sum += number;
           } catch (NumberFormatException nfe){
               System.out.println("Invalid number");
           }
       }

        System.out.println("The sum of the 5 numbers = " + sum);

    }

// V1
//    public static String sumOfNumbers(){
//
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter number #1: ");
//            String number1 = scanner.nextLine();
//
//            System.out.println("Enter number #2: ");
//            String number2 = scanner.nextLine();
//
//            System.out.println("Enter number #3: ");
//            String number3 = scanner.nextLine();
//
//            System.out.println("Enter number #4: ");
//            String number4 = scanner.nextLine();
//
//            System.out.println("Enter number #5: ");
//            String number5 = scanner.nextLine();
//
//            int total = Integer.parseInt(number1) + Integer.parseInt( number2) + Integer.parseInt( number3)
//                    + Integer.parseInt( number4) + Integer.parseInt( number5);
//            return "Total of numbers is :" + total;
//
//        } catch (NumberFormatException e){
//            System.out.println("Characters not allowed! Use only numbers");
//        }
//
//        return "";
//    }
}
