public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        //this() Trebuie sa fie prima linie de cod din constructor
        this(66,88.5,"Default name", "Default email", "Default phone number");
        System.out.println("Empty constructor called");

    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(999, 32767, customerName, phoneNumber, email);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double sum){
        this.accountBalance = accountBalance + sum;
        System.out.println("Deposited amount: " + sum);
    }

    public void withdraw(double sum){
        if (accountBalance < sum) {
            System.out.println("Insufficient funds");
        } else {
            this.accountBalance = accountBalance - sum;
            System.out.println("Withdraw amount: " + sum);
        }
    }


    public void describeCustomer(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: $" + accountBalance);
        System.out.println("Customer name: " + customerName);
        System.out.println("E-mail: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("");
    }


}
