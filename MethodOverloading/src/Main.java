public class Main {
    public static void main(String[] args) {

        calculateScore("Iulian", 54);

        int newScore = calculateScore("Irina" , 102);
        System.out.println("New score is " + newScore);

        System.out.println(calculateScore("test", 10));

        calculateScore(98);
        int randomScore = calculateScore(51);
        System.out.println("Random score is " + randomScore);

        calculateScore();
        int emptyMethod = calculateScore();
        System.out.println("Empty method is " + emptyMethod);

        calculateScore(98, "Tim");
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;

    }

    public static int calculateScore( int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name. No points");
     return 0;
    }

    public static void calculateScore(int score , String playerName){
        System.out.println("Player " + playerName + " scored " + score + " points");
    }

}
