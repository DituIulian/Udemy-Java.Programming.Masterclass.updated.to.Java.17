public class Main {

    public static void main(String[] args) {


        System.out.println(sumDigits(-22));
        System.out.println(sumDigits(7));
        System.out.println(sumDigits(4234));
        System.out.println(sumDigits(12134));

    }

    public static int sumDigits(int number){

        if (number < 0){
            return  -1;
        }

        int sum = 0;

        while (number > 9){
              sum += number % 10;
              number = number / 10;
            }

        sum += number;

        return sum;

        }



}
