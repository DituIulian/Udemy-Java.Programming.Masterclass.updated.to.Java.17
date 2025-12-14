public class Main {

    public static void main(String[] args) {


        int i = 5;

        while (i <= 20){
           if (isEvenNumber(i))
               System.out.println(i);
            i++;
        }

        int number = 4;
        int finishNumber = 20;
        int sumOfEvenNumbers = 0;
        int evenNumbers = 0;

        while (number <= finishNumber){
            number++;

            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number: " + number);
            sumOfEvenNumbers += number;
            evenNumbers++;

            if (evenNumbers == 5){
                break;
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

    }
    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
