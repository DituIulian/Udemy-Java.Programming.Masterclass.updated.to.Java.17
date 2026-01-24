public class CookingAttempt {

    private int temperature;
    private double minutes;
    private String notes;
    private int rating; // 1 to 10

    public CookingAttempt(int temperature, double minutes, String notes, int rating) {
        this.temperature = temperature;
        this.minutes = minutes;
        this.notes = notes;
        this.rating = rating;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature > 50 && temperature < 320) {
            this.temperature = temperature;
        } else{
            System.out.println("Erroare: Temperatura trebuie sa fie cuprinsa intre 50 si 320 grade.");
        }
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        if (minutes > 1 && minutes < 600) {
            this.minutes = minutes;
        } else {
            System.out.println("Erroare: Timpul de gatire trebuie sa fie cuprins intre 1 min si 600 minute.");
        }
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else{
            System.out.println("Erroare: Rating-ul trebuie sa fie intre 1 si 10.");
        }
    }
}
