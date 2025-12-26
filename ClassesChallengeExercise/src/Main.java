public class Main {

    public static void main(String[] args) {

    BankAccount iuliansAccount = new BankAccount();

    iuliansAccount.setAccountBalance(35.25);
    iuliansAccount.setAccountNumber(12);
    iuliansAccount.setEmail("dituiulian@gmail.com");
    iuliansAccount.setCustomerName("Ditu Iulian");
    iuliansAccount.setPhoneNumber("0726 365 401");


    iuliansAccount.deposit(65.22);

    iuliansAccount.describeCustomer();

    iuliansAccount.withdraw(125.75);

    iuliansAccount.describeCustomer();

    iuliansAccount.deposit(225.22);

    iuliansAccount.describeCustomer();

    iuliansAccount.withdraw(125.75);

    iuliansAccount.describeCustomer();
    }
}
