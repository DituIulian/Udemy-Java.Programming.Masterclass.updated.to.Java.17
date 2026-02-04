public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n " +
                "\u2022 First Point\n " +
                "\t\u2022 Sub Point ";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                 \u2022 First point
                    \u2022 Second point""";

        System.out.println(textBlock);

        int age = 36;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2026 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        // .2f precizie decimal points din f
        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %d %n", i);
        }

        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
