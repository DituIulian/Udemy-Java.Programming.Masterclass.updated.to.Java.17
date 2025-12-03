public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }

//    Functional cu int
//    public static int getDurationString(int seconds){
//        int minutes = 0;
//        int hours = 0;
//
//         if (seconds <= 0){
//        System.out.print("Error. Time only goes forward ");
//        return 0;
//         }
//
//        if (seconds <= 59){
//            System.out.println(hours + "h " + minutes + "m " + seconds + "s" );
//        } else if (seconds >= 60 && seconds < 3600){
//            minutes = seconds / 60;
//            seconds = seconds % 60;
//            System.out.println(hours + "h " + minutes + "m " + seconds + "s" );
//        } else if (seconds >= 3600) {
//            hours = seconds / 3600;
//            minutes = seconds % 3600 / 60;
//            seconds = seconds % 60;
//            System.out.println(hours + "h " + minutes + "m " + seconds + "s");
//
//        }
//
//        return 0;
//    }

    public static String getDurationString(int seconds){

        if (seconds < 0 ){
            return "Invalid data for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        int hours = minutes / 60;
//        System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
//        System.out.println("minutes = " + minutes);
//        System.out.println("remainingMinutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
//        System.out.println("remainingSecond = " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }

    // Functional doar pentru challange propus - Minutes pot fi mai mult de 60, seconds maxim 60
    public static String getDurationString(int minutes,int seconds){

        if (minutes < 0 ){
            return "Invalid data for minutes(" + minutes + "), must be a positive integer value";
        }
        if (seconds <= 0 || seconds >= 59){
            return "Invalid data for seconds(" + minutes + "), must be between 0 and 59";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";


    }
}
