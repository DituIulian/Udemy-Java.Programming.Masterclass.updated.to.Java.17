public class Car {

    private String make = "Tesla";
    private String model = "Model x";
    private String color= "White";
    private int doors = 4;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : " "));
    }
    
}
