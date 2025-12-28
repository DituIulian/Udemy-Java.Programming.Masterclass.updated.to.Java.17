public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Iulian", "dituiulian@gmail.com");
    }

    public Customer(String name, String email){
        this(name, 99999, email);

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void describeCustomer(){
        System.out.println("Customer name: " + name);
        System.out.println("Credit limit: " + creditLimit);
        System.out.println("Email: " + email);
        System.out.println("");
    }

}
