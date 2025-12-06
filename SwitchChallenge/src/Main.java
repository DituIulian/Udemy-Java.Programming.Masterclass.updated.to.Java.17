public class Main {

    public static void main(String[] args) {

        char charValue = 'a';
//        String word = natoWord(charValue);
        System.out.println(natoWord(charValue));


    }
    public static String natoWord(char charValue){

        switch (charValue){
            case 'A' : case 'a':
                return "A is for Able";
            case 'B': case 'b':
                return "B is for Baker";
            case 'C': case 'c':
                return "C is for Charlie";
            case 'D': case 'd':
                return "D is for Dog";
            case 'E': case 'e':
                return "E is for Easy";
            default:
                return charValue + " is not a valid char";
        }
    }

}
