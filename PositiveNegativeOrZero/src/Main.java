public class Main {


    public static void main(String[] args) {

        checkNumber(7);
        checkNumber(-7);
        checkNumber(0);

    }

    public static void checkNumber(int number){

        if (number > 0){
            System.out.println(number + " is positive");
        }  else if (number < 0 ){
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
    }

}
