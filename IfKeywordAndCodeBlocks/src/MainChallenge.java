public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 2000,6,120);

        score = 800;
        levelCompleted = 5;
        bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 1000,9,120);

        System.out.println("Age: " + calculateAge(1990));
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }

    public static int calculateAge(int birthDate){
        return 2025 - birthDate;
    }


}
