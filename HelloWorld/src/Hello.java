public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Iulian");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am not scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 70;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <=90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen!");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to some country");
        }
        System.out.println(isDomestic);

        //challenge
        double value1 = 20.00d;
        double value2 = 80.00d;
        double sumValue = (value1 + value2) * 100.00d;
        double remainder = sumValue % 40.00d;

        boolean remainderIsZero = remainder == 0.00 ? true : false ;
        System.out.println("Is remainder zero? : " + remainderIsZero);

        if (!remainderIsZero){
            System.out.println("Got some remainder " + remainder);
        }


    }
}
