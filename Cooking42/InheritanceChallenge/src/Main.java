public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John", "01.01.1990", "10.08.2022");
        System.out.println(john);
        System.out.println("Age = " + john.getAge());
        System.out.println("Pay = " + john.collectPay());
        System.out.println();

        SalariedEmployee joe = new SalariedEmployee("Joe", "09.11.2000", "11.12.2023", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe`s Pension check = $" + joe.collectPay());
        System.out.println(joe);
        System.out.println();

        HourlyEmployee mary = new HourlyEmployee("Marry", "01.02.1989", "03.03.2021", 15);
        System.out.println(mary);
        System.out.println("Marry`s paycheck = $" + mary.collectPay());
        System.out.println("Marry`s Holiday Pay = $" + mary.getDoublePay());
    }
}
