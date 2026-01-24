public class Recipe {

    private String title;
    private String category;
    private CookingAttempt newAttempt;

    public Recipe(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public void addAttempt (CookingAttempt attempt){
        this.newAttempt = attempt;
    }

    public void showRecipeDetails(){
        // De modificat odata cu schimbarile
        System.out.println();
        System.out.println("--- REȚETĂ: " + title + " (" + category + ") ---");
        if (newAttempt != null) {
            System.out.println("O varianta : " + newAttempt.getTemperature() + " grade, " +
                    newAttempt.getMinutes() + " min.");
            System.out.println("Notă personală: " + newAttempt.getNotes());
            System.out.println("Rating: " + newAttempt.getRating() + "/10");
        } else {
            System.out.println("Încă nu ai gătit această rețetă.");
        }
    }

}
