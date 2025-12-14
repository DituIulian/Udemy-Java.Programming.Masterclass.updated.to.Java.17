public class Main {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 5 ; i++){
            System.out.println(i);
        }

        int j = 6;
        boolean isReady  = false;

        while ( j <= 10) {
            System.out.println(j);
            j++;
        }

        while (true){
            if (j > 15){
                break;
            }
            System.out.print(j + ", ");
            j++;
        }

        System.out.println(" ");

        do {
            if (j > 20){
                break;
            }
            System.out.println("Do while -> " + j );
            j++;
        }  while (isReady) ;


        int number = 15;
        while (number < 50){
            number +=5;
            if ( number % 25 == 0){
                continue;
            }
            System.out.print(number + ", ");
        }


    }
}
