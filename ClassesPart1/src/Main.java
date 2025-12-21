public class Main {
    public static void main(String[] args) {

        Car car = new Car();

//        car.make = "Porche";
//        car.model = "Carrera";
//        car.color = "Red";

//        System.out.println("make = " + car.make);
//        System.out.println("model = " + car.model);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();



    }
}
