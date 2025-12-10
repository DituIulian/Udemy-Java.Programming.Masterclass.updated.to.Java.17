public class Main {

    public static void main(String[] args) {

        int primeCounter = 0;


        for (int i = 626; i <= 1000; i++){
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                primeCounter++;

                if (primeCounter == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }

    }


    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }

        for(int i = 2; i <= wholeNumber / 2; i++){ // or i < wholeNumber - slower version
            if(wholeNumber % i == 0){
                return false;
            }
        }
        return true;
    }

}
