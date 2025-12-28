public class Main {
    public static void main(String[] args) {

    Customer iulian = new Customer();

    Customer irina = new Customer("Irina", "dituirina@gmail.com");

    Customer tim = new Customer("Tim", 32767, "tim@learningjava.com");

    iulian.describeCustomer();
    irina.describeCustomer();
    tim.describeCustomer();

    }
}
