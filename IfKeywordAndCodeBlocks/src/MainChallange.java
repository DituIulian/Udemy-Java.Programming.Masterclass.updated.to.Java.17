public class MainChallange {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your 1st final score was: " + finalScore);
        }

        score = 800;
        levelCompleted = 5;
        bonus = 100;
        finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your 2nd final score was: " + finalScore);
        }
    }
}
