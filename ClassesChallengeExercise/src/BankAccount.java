public class BankAccount {

    private int accountNumber = 0;
    private double accountBalance = 0.00;
    private String customerName = "";
    private String email = "";
    private String phoneNumber = "";

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
