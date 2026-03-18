public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "09/07/1990";
        int startingIndex = birthDate.indexOf("1990");

        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "27", "04", "1989");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "23" + "/" + "11" + "/" + "1985";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("05").concat("/").concat("1987");
        System.out.println("newDate = " + newDate);

        System.out.println("newDate = " + newDate.replace('/', '-'));
        System.out.println("newDate = " + newDate.replace("2", "00"));

        System.out.println("newDate = " + newDate.replaceFirst("/", "-"));
        System.out.println("newDate = " + newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));



    }
}
