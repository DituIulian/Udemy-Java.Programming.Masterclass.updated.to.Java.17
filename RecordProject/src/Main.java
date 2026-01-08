public class Main {
    public static void main(String[] args) {

        System.out.println();

        for (int i = 1; i <= 5; i++){
            Student s = new Student("S92400" + i,
                    switch (i){
                case 1 -> "Marry";
                case 2 -> "Irina";
                case 3 -> "Iulian";
                case 4 -> "Tim";
                case 5 -> "Harry";
                        default -> "Anonymous";
                    },
                    "05.11.1995",
                    "Java MasterClass");
            System.out.println(s);
        }

        System.out.println();

        for (int i = 1; i <= 5; i++){
            DIStudent s = new DIStudent("S92300" + i,
                    switch (i){
                        case 1 -> "Jane";
                        case 2 -> "Elena";
                        case 3 -> "Iulian";
                        case 4 -> "Tom";
                        case 5 -> "Potter";
                        default -> "Anonymous";
                    },
                    "05.11.1990",
                    "Java MasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006 ", "Ann", "05.11.1992", "Java MasterClass");
        DIStudent recordStudent = new DIStudent("S923007 ", "Ben", "05.11.1992", "Java MasterClass");

        System.out.println();
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        Nu functioneaza, record este immutable si nu are set
//        recordStudent.setClassList(recordStudent.classList()+ "Java OCP Exam 829");
        System.out.println();
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
