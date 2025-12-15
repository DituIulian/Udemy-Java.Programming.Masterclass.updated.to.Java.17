public class Main {

    public static void main(String[] args) {


        System.out.println(sumDigits(-22));
        System.out.println(sumDigits(7));
        System.out.println(sumDigits(372));

    }

    public static int sumDigits(int digit){
    // nu trebuie sa accepte un numar negativ - daca este negativ trb sa returneze -1 ( care inseamna invalid value)
        // sum se face pt digiti - 125 e 1 + 2 + 5 deci 8
        //daca este un numar de 1 digit, returneaza numarul
        if (digit < 0){
            return  -1;
        }

        if (digit >= 10){
            int sum = 0;
            while ( sum < 1){
              sum = digit % 10;
                
            }

            return sum;
        }

        return digit;
    }

}
