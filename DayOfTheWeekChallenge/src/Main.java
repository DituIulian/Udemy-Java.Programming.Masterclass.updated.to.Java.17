public class Main {

    public static void main(String[] args) {

       int weekDay = 2;

       String dayOfTheWeek =  switch (weekDay){
            case 0 -> ("Sunday");
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> ("Thursday");
            case 5 -> ("Friday");
            case 6 -> ("Saturday");

            default -> ("Invalid day");
        };

        System.out.println("day " + weekDay + " is for " + dayOfTheWeek);

        int day = 6;
        String weekDayIf =  printWeekDay(day);
        System.out.println("day " + day + " is for " + weekDayIf);

    }

//    public static void printDayOfWeek(int dayNumber){
//
//        switch (dayNumber){
//            case 0 -> System.out.println("Sunday");
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//
//            default -> System.out.println("Invalid day");
//        }
//    }


    public static String printWeekDay(int weekDay) {

        if (weekDay == 0) {
            return "Sunday";
        } else if (weekDay == 1) {
            return "Monday";
        } else if (weekDay == 2) {
            return "Tuesday";
        } else if (weekDay == 3) {
            return "Wednesday";
        } else if (weekDay == 4) {
            return "Thursday";
        } else if (weekDay == 5) {
            return "Friday";
        } else if (weekDay == 6) {
            return "Saturday";
        } else {
            return "Invalid day";
        }

    }
}
