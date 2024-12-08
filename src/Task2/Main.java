package Task2;

import java.util.Scanner;

public class Main implements PeaksoftInterface {
    public static void main(String[] args) {
        Student student1 = new Student("Ibrohim", "male", "ibo@gmail.com");
        Student student2 = new Student("Altynai", "female", "altynai@gmail.com");
        Student student3 = new Student("Elzar", "male", "elzar@gmail.com");
        Student student4 = new Student("Ainazik", "female", "ainazik@gmail.com");

        Student student5 = new Student("Nurislam", "female", "Nurislam@gmail.com");
        Student student6 = new Student("Beka", "male", "Beka@gmail.com");
        Student student7 = new Student("Marsel", "male", "Marsel@gmail.com");

        Student[] studentsGroup1 = {student1, student2, student3, student4};
        Student[] studentsGroup2 = {student6, student5, student7};
        Student[] allStudents = {student1,student2, student3, student4, student6, student5, student7};

        Group group1 = new Group("Java", studentsGroup1, 1);
        Group group2 = new Group("JS", studentsGroup2, 2);

        Mentor mentor1 = new Mentor(group1, "Mentor1@gmail.com", "male", "Rinat");
        Mentor mentor2 = new Mentor(group2, "Mentor2@gmail.com", "male", "Amanat");

        Mentor[] mentors = {mentor1, mentor2};

        Peaksoft peaksoft = new Peaksoft("Peaksoft", "Ahunbaeva/100", mentors, allStudents);

        Scanner scanner = new Scanner(System.in);
        int choose = 0;

        while (choose != 7){
            getMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    Main main = new Main();
                    main.getAllMentors(mentors);
                    break;
                }
                case 2: {
                    Main main = new Main();
                    main.getAllStudents(allStudents);
                    break;
                }
                case 3: {
                    System.out.print("Введите имя студента: ");
                    String name = scanner.next();
                    Main main = new Main();
                    main.searchByStudentName(name, allStudents);
                    break;
                }
                case 4: {
                    System.out.print("Введите email ментора: ");
                    String email = scanner.next();
                    Main main = new Main();
                    main.searchByMentorEmail(email, mentors);
                    break;
                }
                case 5: {
                    System.out.println("Список студентов:");
                    Main main = new Main();
                    main.sortByStudentName(allStudents);
                    break;
                }
                case 6: {
                    System.out.print("Введите пол (male или female): ");
                    String gender = scanner.next();
                    Main main = new Main();
                    main.onlyMaleOrFemaleGenders(gender, allStudents);
                    break;
                }
                case 7: {
                    System.out.println("Программа завершена.");
                    break;
                }
                default: {
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
                }
            }

        }

    }

    public static void getMenu(){
        System.out.println("""
                1. getAllMentors()
                2. getAllStudents()
                3. searchByStudentName()
                4. searchByMentorEmail()
                5. sortByStudentName()
                6. onlyMaleOrFemaleGenders()
                """);
    }

    public void getAllMentors(Mentor[] mentors) {
        for (Mentor mentor : mentors){
            System.out.println(mentor.getName());
        }
    }

    public void getAllStudents(Student[] students) {
        for (Student student : students){
            System.out.println(student.getName());
        }
    }

    @Override
    public void searchByStudentName(String name, Student[] students) {
        for (Student student : students){
            if (student.getName().equalsIgnoreCase(name)){
                System.out.println(student.getName());
                System.out.println(student.getEmail());
                System.out.println(student.getGender());
            }
        }
    }

    @Override
    public void searchByMentorEmail(String email, Mentor[] mentors) {
        for (Mentor mentor : mentors){
            if (mentor.getEmail().equalsIgnoreCase(email)){
                System.out.println(mentor.getName());
                System.out.println(mentor.getEmail());
                System.out.println(mentor.getGender());
                System.out.println(mentor.getGroup().getName());
            }
        }
    }

    @Override
    public void sortByStudentName(Student[] students) {
        for (Student student : students){
            System.out.println(student.getName());
        }
    }

    @Override
    public void onlyMaleOrFemaleGenders(String gender, Student[] students) {
        for (Student student : students){
            if (student.getGender().equalsIgnoreCase(gender)){
                System.out.println(student.getName());
            }
        }
    }
}
