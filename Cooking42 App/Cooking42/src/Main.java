public class Main {

    public static void main(String[] args) {

        Recipe pieptDePuiLaGratar = new Recipe("Piept de pui la gratar", "Fel principal");
        CookingAttempt triedToday = new CookingAttempt(180, 12, "Carnea a iesit frageda, facuta in tigaia grill", 7);
        pieptDePuiLaGratar.addAttempt(triedToday);
        pieptDePuiLaGratar.showRecipeDetails();

        Recipe cartofiGatitiDe2ori = new Recipe("Cartifi gatiti de 2 ori", "Garnitura");
        CookingAttempt triedToday2 = new CookingAttempt(200, 40, "Fierti intai 15 min, apoi 25 min la Air Fryer", 8);
        cartofiGatitiDe2ori.addAttempt(triedToday2);
        cartofiGatitiDe2ori.showRecipeDetails();

    }
}
