package Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        School school = new School("Task1.School", "USA", LocalDate.of(2022, 02, 01));
        University university = new University("Task1.University", "Kyrgyzstan", LocalDate.of(2022, 10, 10));
        College college = new College("college", "Canada", LocalDate.of(2022, 9, 04));

        Student student1 = new Student("Rinat", "Kunduzov", "male", LocalDate.of(2023, 9, 01), school);
        Student student2 = new Student("Marsel", "Altynaev", "male", LocalDate.of(2023, 9, 01), college);
        Student student3 = new Student("Altynai", "Bekieva", "female", LocalDate.of(2023, 9, 01), university);
        Student student4 = new Student("Beka", "Nurislamov", "male", LocalDate.of(2023, 9, 01), school);
        Student student5 = new Student("Nurislam", "Elzarov", "male", LocalDate.of(2023, 9, 01), university);
        Student student6 = new Student("Elzar", "Ibrohimov", "male", LocalDate.of(2023, 9, 01), school);
        Student student7 = new Student("Ibrohim", "Ainazikov", "male", LocalDate.of(2023, 9, 01), college);
        Student student8 = new Student("Ainazik", "Rinatova", "female", LocalDate.of(2023, 9, 01), college);
        Student student9 = new Student("Rinatbek", "Kunduzov", "male", LocalDate.of(2023, 9, 01), school);
        Student student10 = new Student("Kunduz", "Rinatbekov", "female", LocalDate.of(2023, 9, 01), university);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        mainMethod(students);
    }

    public static void mainMethod(Student[] students){
        for (Student student : students){
            System.out.println(student.getName());
            System.out.println(student.getSurname());
            System.out.println(student.getGender());
            System.out.println(student.getDateOfStart());
            System.out.println(student.getEducationCenter().getName());
            System.out.println("____________________");
        }
    }
}