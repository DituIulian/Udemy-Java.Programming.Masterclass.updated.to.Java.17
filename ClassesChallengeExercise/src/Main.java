public class Main {

    public static void main(String[] args) {

    BankAccount iuliansAccount = new BankAccount();

    BankAccount irinasAccount = new BankAccount(65, 125, "Irina Ditu", "irinaditu@gmail.com", "0722333444");

    BankAccount bobsAccount = new BankAccount();

    BankAccount tedsAccount = new BankAccount("Ted", "ted@ted.ro", "0733554455");

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

    irinasAccount.describeCustomer();

    irinasAccount.deposit(355);

    irinasAccount.describeCustomer();

    bobsAccount.describeCustomer();

    tedsAccount.describeCustomer();
    }
}
