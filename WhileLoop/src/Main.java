public class Main {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 5 ; i++){
            System.out.println(i);
        }

        int j = 6;
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

    }
}
