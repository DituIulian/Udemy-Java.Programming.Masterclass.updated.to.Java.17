public class ChallengeTest {


    public static void main(String[] args) {

//        displayHighScorePosition("Iulian", 1);
//        System.out.println("Ai obtinut locul: " + calculateHighScorePosition(1500));
//        System.out.println("Ai obtinut locul: " + calculateHighScorePosition(1000));
//        System.out.println("Ai obtinut locul: " + calculateHighScorePosition(500));
//        System.out.println("Ai obtinut locul: " + calculateHighScorePosition(100));
//        System.out.println("Ai obtinut locul: " + calculateHighScorePosition(25));

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Iulian", highScorePosition);
        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Marius", highScorePosition);
        highScorePosition = calculateHighScorePosition(499);
        displayHighScorePosition("Irina", highScorePosition);
        highScorePosition = calculateHighScorePosition(99);
        displayHighScorePosition("Fanica", highScorePosition);
        highScorePosition = calculateHighScorePosition(-2005);
        displayHighScorePosition("Foca", highScorePosition);
    }


    public static void displayHighScorePosition(String playerName , int position ) {
        System.out.println(playerName + " a obtinut locul " + position);
    }

    public static int calculateHighScorePosition(int score){

       int scorePosition;

       if (score >= 1000){
          scorePosition = 1;
       } else if(score >= 500 && score < 1000){ // Nu este necesar score < 1000 deoarece daca este egal cu 1000, conditia a fost deja indeplinita si iese din la priumul IF
           scorePosition = 2;
       } else if (score >= 100 && score < 500){ //Idem
           scorePosition = 3;
       } else {
           scorePosition = 4;
       }

        return scorePosition;
    }

}

